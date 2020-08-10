import anotations.Cachable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

public class ProxyCalculator implements InvocationHandler {
    private final Object original;
    private HashMap<Integer, Integer> setCacheValue;

    public ProxyCalculator(Object original){
        this.original = original;
        setCacheValue = new HashMap();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (!method.isAnnotationPresent(Cachable.class)){
            System.out.println("Метод не кеширован");
            return method.invoke(original,args);
        }

        CacheMethodMapper cacheMethodMapper = new CacheMethodMapper();
        CacheMethodRepository cacheMethodRepository = new CacheMethodRepository(
                "jdbc:h2:~/test",
                "sa",
                "1234",
                "org.h2.Driver",
                cacheMethodMapper
        );

        List<CacheMethod> resultsMethod = cacheMethodRepository.findAll();
        int arg = (int) args[0];
        int resultMethod = (int) method.invoke(original, arg);

        for (CacheMethod result: resultsMethod){
            if (result.getArg() == arg && result.getName() == method.getName())
                System.out.println("Нашел в базе имя метода и аргумент");
                return result.getResult();
        }

        CacheMethod cacheMethod = new CacheMethod(method.getName(), arg, resultMethod);
        cacheMethodRepository.create(cacheMethod);
        System.out.println("Загрузил в базу название метода, аргумент и результат");
        return resultMethod;
    }
}
