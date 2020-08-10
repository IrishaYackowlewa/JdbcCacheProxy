import anotations.Column;
import anotations.Id;
import anotations.Table;

@Table("CACHABLE")
public class CacheMethod {

    @Column("NAME")
    private String name;

    @Column("ARG")
    private Integer arg;

    @Column("RESULT")
    private Integer result;

    public CacheMethod(String name, Integer arg, Integer result) {
        this.name = name;
        this.arg = arg;
        this.result = result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArg(Integer arg) {
        this.arg = arg;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public Integer getArg() {
        return arg;
    }

    public Integer getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", arg=" + arg +
                ", result='" + result + '\'' +
                '}';
    }
}
