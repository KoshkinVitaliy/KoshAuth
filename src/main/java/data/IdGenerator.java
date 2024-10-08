package data;

public class IdGenerator {
    public static String generateId(User user) {
        var id = user.getJob().substring(0,1).toUpperCase() + "-";

        return id + generateNumbersId();
    }

    private static String generateNumbersId() {
        var numbersId = "";
        switch (String.valueOf(User.counter).length()) {
            case 1 -> numbersId = "00000" + User.counter;
            case 2 -> numbersId = "0000" + User.counter;
            case 3 -> numbersId = "000" + User.counter;
            case 4 -> numbersId = "00" + User.counter;
            case 5 -> numbersId = "0" + User.counter;
            case 6 -> numbersId = String.valueOf(User.counter);
        }
        return numbersId;
    }


}
