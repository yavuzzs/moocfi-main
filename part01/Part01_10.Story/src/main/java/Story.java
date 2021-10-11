
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.");
        String answer = scanner.nextLine();
        System.out.println("What is the main character called?");
        String answer1 = scanner.nextLine();
        System.out.println("What is their job?");
        String answer2 = scanner.nextLine();

        System.out.println("Here is story: " + "Once upon a time there was " +answer1 + ", who was " +answer2+"." );
    }
}
