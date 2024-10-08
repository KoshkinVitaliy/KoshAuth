package data;

public class UsernameGenerator {
    private static final String[] en_letters = {".", "a", "b", "v", "g", "d", "e", "e", "j", "z", "i", "iy", "k", "l",
            "m", "n","o", "p", "r", "s","t", "u", "f", "h","ts", "ch", "sh", "sh", "","i", "", "e","u", "ya"};
    private static final String[] ru_letters = {".", "а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л",
            "м", "н","о", "п", "р", "с","т", "у", "ф", "х","ц", "ч", "ш", "щ", "ъ","ы", "ь", "э","ю", "я"};

    public static String generateUsername(User user) {
        var username = (user.getSurname() + "."
                + user.getName().substring(0,1) + "."
                + user.getLastName().substring(0,1)).toLowerCase();
        var correctUsername = new StringBuilder();

        for (var letter : username.split("")) {
            for (var i=0; i < ru_letters.length; i++) {
                if (letter.equals(ru_letters[i])) {
                    correctUsername.append(en_letters[i]);
                }
            }
        }
        System.out.println(correctUsername);

        return correctUsername.toString();
    }
}
