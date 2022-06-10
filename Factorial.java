import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=1, fact=1;
        System.out.print("Enter a number to find factorial: ");
        int n= s.nextInt();
        while(i<=n){
            fact= fact *i;
            i++;
        }
        System.out.println("Factorial of "+ n + " = " + fact);
        s.close();

    }
}