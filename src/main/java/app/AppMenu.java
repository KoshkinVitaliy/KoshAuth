package app;

import data.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppMenu {
    public static void start() {
        System.out.println("System started");
        showMenu();
    }

    private static void showMenu() {
        System.out.println("1 - Войти");
        System.out.println("2 - Зарегистрироваться");
        System.out.println("3 - Выйти");

        checkUserChoice(getUserChoice());
    }

    private static void checkUserChoice(int userChoice) {
        switch (userChoice) {
            case 1 -> showEnterMenu();
            case 2 -> showRegistrationMenu();
            case 3 -> System.exit(0);
            default -> {System.out.println("Введён неккоректный выбор. " +
                    "Попробуйте ещё.");
                showMenu();
            }

        }
    }

    private static User showRegistrationMenu() {
        var name = "";
        var surname = "";
        var lastName = "";
        var password = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите фамилию:");
        surname = sc.nextLine();

        System.out.println("Введите имя:");
        name = sc.nextLine();

        System.out.println("Введите отчество:");
        lastName = sc.nextLine();

        System.out.println("Введите должность:");
        User.checkJob();

        System.out.println("Введите пароль:");
        password = sc.nextLine();

        return new User(surname, name, lastName, password);
    }

    private static void showEnterMenu() {
    }

    private static int getUserChoice() {
        var choice = 0;
        try {
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            //sc.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Неккоректный тип ввода меню. Попробуйте снова");
            getUserChoice();
        }
        return choice;
    }
}
