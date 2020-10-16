import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.SQLException;

public class Main00 {

    public static void main(String[] args) throws SQLException {
        DbUtil.getConnection();
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUsername("arek");
        user.setEmail("arkadiusz.jozwiak@coderslab.pl");
        user.setPassword("pass");
        DbUtil.create(user);
    }
}

