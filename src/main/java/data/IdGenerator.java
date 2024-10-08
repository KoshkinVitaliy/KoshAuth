package data;

import java.sql.SQLException;

public class IdGenerator {
    public static String generateId(User user) {
        var id = user.getJob().substring(0,1).toUpperCase() + "-";

        return id + generateNumbersId();
    }

    private static String generateNumbersId() {
        DbConnectionImpl connection = new DbConnectionImpl();
        var counter = connection.countObjects() + 1;
        var numbersId = "";
        switch (String.valueOf(counter).length()) {
            case 1 -> numbersId = "00000" + counter;
            case 2 -> numbersId = "0000" + counter;
            case 3 -> numbersId = "000" + counter;
            case 4 -> numbersId = "00" + counter;
            case 5 -> numbersId = "0" + counter;
            case 6 -> numbersId = String.valueOf(counter);
        }
        try {
            connection.connect().close();
        }
       catch (SQLException e) {
           System.out.println("Failure");
       }
        return numbersId;
    }


}
