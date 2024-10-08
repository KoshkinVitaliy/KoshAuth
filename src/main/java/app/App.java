package app;

import data.DbConnectionImpl;
import data.IdGenerator;
import data.User;

public class App {
    public static void main(String[] args) {
//        DbConnectionImpl dbConnection = new DbConnectionImpl();
//
//        dbConnection.connect();
        User user = new User("", "", "", "");

        System.out.println(IdGenerator.generateId(user));
    }
}
