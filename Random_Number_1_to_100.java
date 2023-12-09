//task 1
//Generate a random number within a specified range, such as 1 to 100.
import java.util.Random;

public class Random_Number_1_to_100 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("Random number between 1 and 100 is:" + randomNumber);
    }
}
