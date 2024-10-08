package data;

import java.sql.SQLException;

public class DbConnectionImpl  implements DbConnection{
    @Override
    public boolean insertUser(User user) {
        try {
            var request = "INSERT INTO " +
                    "public.users(id, name, surname, last_name, username, password, job, salary) " +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

            var connection = connect();

            var prepareStatement = connection.prepareStatement(request);

            prepareStatement.setString(1, user.getId());
            prepareStatement.setString(2, user.getName());
            prepareStatement.setString(3, user.getSurname());
            prepareStatement.setString(4, user.getLastName());
            prepareStatement.setString(5, user.getUsername());
            prepareStatement.setString(6, user.getPassword());
            prepareStatement.setString(7, user.getJob());
            prepareStatement.setDouble(8, user.getSalary());

            prepareStatement.executeUpdate();

            System.out.println("Data inserted successfully!");
            return true;
        }
        catch (SQLException e) {
            System.out.println("Data insertion failed. Please, try again!");
            System.out.println(e);
        }
        return false;
    }
}
