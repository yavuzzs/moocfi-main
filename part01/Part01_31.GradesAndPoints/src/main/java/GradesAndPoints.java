
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int grades = Integer.valueOf(scan.nextLine());
        if (grades > 100) {
            System.out.println("incredible!");
        } else if (grades >= 90) {
            System.out.println("5");
        } else if (grades >= 80) {
            System.out.println("4");
        }else if (grades>=70){
            System.out.println("3");
        }else if (grades>=60){
            System.out.println("2");
        }else if (grades>=50){
            System.out.println("1");
        }else if (grades>=0){
            System.out.println("failed");
        }else{
            System.out.println("impossible!");
        }
    }
}