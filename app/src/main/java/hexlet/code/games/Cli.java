package hexlet.code.games;

import java.util.Scanner;
public class Cli {
    public static String greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");
        return username;
    }
}