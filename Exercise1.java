import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float n = inp.nextFloat();
        int N = (int)n;
        
        if (n<0)
            System.out.print("The number is negative,");
        else if (n>0)
            System.out.print("The number is Positive,");
        
        if (n==N)
            System.out.print(" Int");
        else 
            System.out.print(" Float");

        if (n%2==0)
            System.out.print(" and even.");
        else
            System.out.print(" and odd.");
        
        inp.close();
    }
}