
//task 1
//2problem Statement
//Prompt the user to enter their guess for the generated number in java.
import java.util.Scanner;

public class Guess_Number {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        System.out.println("Guess a number between 0 and 100");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        if (guess == number) {
            System.out.println("Congratulations! You guessed the correct number!");
        } else {
            System.out.println("Sorry, you guessed incorrectly. The correct number was" + number);
        }
    }
}
