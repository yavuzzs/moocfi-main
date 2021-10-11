
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(scanner.nextLine());
        int addition = number1 + number2;
        int extraction = number1 - number2;
        int multiplication = number1*number2;
        double divide = (double) number1/number2;
        System.out.println(number1 +" + "+ number2+ " = "+addition);
        System.out.println(number1+" - "+number2+" = "+extraction);
        System.out.println(number1+" * "+number2+" = "+multiplication);
        System.out.println(number1+" / "+number2+" = "+divide);

    }
}
