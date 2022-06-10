import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text:- ");
        String str = input.nextLine();
        System.out.println("You typed: " + str);
        input.close();
    }
}
