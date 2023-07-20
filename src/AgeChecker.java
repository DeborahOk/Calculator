import java.sql.SQLOutput;
import java.util.Scanner;
public class AgeChecker {
    public static void main(String[] args) {
        //this is to read a person age input
        //assign value of variable to date of birth

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = reader.nextInt();
        System.out.println("Your age is" + age);
    }
}