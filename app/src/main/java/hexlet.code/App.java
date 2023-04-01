package hexlet.code;

import static hexlet.code.GameChoice.runGame;
import static hexlet.code.games.Calc.calc;
import static hexlet.code.games.Cli.greetUser;
import static hexlet.code.games.Even.evenGame;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        int userChoice = sc.nextInt();

        System.out.println("Your choice: " + userChoice);
        System.out.println("");
        String username = "";
        int score = 0;
        String winorlose = "L";

        if (userChoice == 1) {
            greetUser();
            score = -1;
        } else if (userChoice == 2) {
            username = greetUser();
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            winorlose = runGame(userChoice);
        } else if (userChoice == 3) {
            username = greetUser();
            System.out.println("What is the result of the expression?");
            winorlose = runGame(userChoice);
        } else if (userChoice == 4) {
            username = greetUser();
            System.out.println("Find the greatest common divisor of given numbers.");
            winorlose = runGame(userChoice);
        } else if (userChoice == 5) {
            username = greetUser();
            System.out.println("What number is missing in the progression?");
            winorlose = runGame(userChoice);
        } else if (userChoice == 6) {
            username = greetUser();
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            winorlose = runGame(userChoice);
        }

        while (score < 3 && score > -1) {
            if (winorlose.equals("W")) {
                score++;
            } else {
                score = -1;
                System.out.println("Let's try again, " + username + "!");
            }

            if (score == 3) {
                System.out.println("Congratulations, " + username + "!");
            } else if (score > -1 && score < 3) {
                winorlose = runGame(userChoice);
            }
        }
    }
}
