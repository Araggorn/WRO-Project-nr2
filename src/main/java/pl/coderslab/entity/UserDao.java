package pl.coderslab.entity;
public class UserDao {

    public static final String CREATE_USER_QUERY =
            "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
    public static final String DELETE_USER_QUERY =
            "DELETE FROM users WHERE id = ?";
    public static final String READ_USER_QUERY =
            "SELECT * FROM users where id = ?";
    public static final String UPDATE_USER_QUERY =
            "UPDATE users SET username =? email =? password=? WHERE id = ?";
    public static final String FIND_ALL =
            "SELECT * FROM users";

}
