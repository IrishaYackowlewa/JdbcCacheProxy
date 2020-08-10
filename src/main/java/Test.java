import interfaces.InterCalculator;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        InterCalculator calc = new Calculator();
        InterCalculator calcProxy = (InterCalculator) Proxy.newProxyInstance(
                InterCalculator.class.getClassLoader(),
                new Class<?>[] { InterCalculator.class },
                new ProxyCalculator(calc)
        );

        System.out.println(calcProxy.fibonachi(5));
        System.out.println(calcProxy.fibonachi(3));
        System.out.println(calcProxy.sum(3.6,5));
        System.out.println(calcProxy.fibonachi(20));
        System.out.println(calcProxy.fibonachi(10));
        System.out.println(calcProxy.fibonachi(1));
        System.out.println(calcProxy.fibonachi(20));
        System.out.println(calcProxy.fibonachi(3));
        System.out.println(calcProxy.multip(3.63,5));
        System.out.println(calcProxy.fibonachi(20));
    }
}
