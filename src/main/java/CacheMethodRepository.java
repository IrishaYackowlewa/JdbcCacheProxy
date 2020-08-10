import interfaces.Mapper;

public class CacheMethodRepository extends AbstractRepository<CacheMethod>{

    public CacheMethodRepository(String jdbcUrl, String user, String password, String driver, Mapper<CacheMethod> mapper) {
        super(jdbcUrl, user, password, driver, mapper);
    }
}
