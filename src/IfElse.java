public class IfElse {
    public static void main(String[] args) {
        // if statement = performs a block of code if the condition to be true
        // logical operator = used to connect two or more expression
        // && (double ampersand) = (AND) both conditions must be true

        int bedroomNum = 5;
        // if the bedroom number between 2 to 5, the house is suitable for family
        if (bedroomNum >= 2 && bedroomNum < 6) {
            System.out.println("This house is suitable");
        }else {
            System.out.println("Less bedrooms needed.");
        }
    }
}
