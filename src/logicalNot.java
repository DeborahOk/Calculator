import java.util.Scanner;
public class logicalNot {
    public static void main(String[] args) {
        System.out.println("Would you like to play again?");
        Scanner reader = new Scanner(System.in);
        String text = "Yes";
        if (!(text.equals("No") || text.equals("NO"))){
            System.out.println("Game continue");
        }
        else {
            System.out.println("End Game");
        }
    }
}
