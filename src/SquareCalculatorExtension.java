import java.util.Scanner;
public class SquareCalculatorExtension {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter width and height");

        System.out.println("Height = ");
        double height = reader.nextDouble();

        System.out.println("Width = ");
        double width = reader.nextDouble();

        double perimeter = 2 * (width + height); // 2L + 2W
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}
