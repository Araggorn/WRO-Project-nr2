import pl.coderslab.entity.DbUtil;
import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.SQLException;
import java.util.Arrays;

public class Main00 {

    public static void main(String[] args) throws SQLException {
        DbUtil.getConnection();
        System.out.println(DbUtil.read(1));



    }
}



