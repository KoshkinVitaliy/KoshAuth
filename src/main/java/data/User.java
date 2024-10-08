package data;

import java.util.Scanner;

public class User {
    private String id;
    private String name;
    private String surname;
    private String lastName;
    private String username;
    private String password;
    private String job;
    private double salary;
    public static int counter = 1;

    public User(String surname, String name,  String lastName, String password) {
        counter++;
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.job = checkJob();
        this.id = IdGenerator.generateId(this);
        this.username = UsernameGenerator.generateUsername(this);
        this.salary = 0;
    }

    public static String checkJob() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите должность:");

        var job = sc.nextLine();

        switch (job.toUpperCase()) {
            case "ADMINISTRATOR", "MANAGER", "ENGINEER" -> {
                return job;
            }
            default -> {
                System.out.println("Incorrect job. Please, try again.");
                checkJob();
            }
        }
        return job;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
