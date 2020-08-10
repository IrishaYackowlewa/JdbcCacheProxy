import interfaces.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CacheMethodMapper implements Mapper<CacheMethod> {
    @Override
    public List<CacheMethod> map(ResultSet resultSet) throws SQLException {
        List<CacheMethod> methods = new ArrayList<>();
        while(resultSet.next()) {
            methods.add(
                    new CacheMethod(
                            resultSet.getLong("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("arg"),
                            resultSet.getInt("result")
                    )
            );
        }
        return methods;
    }
}
