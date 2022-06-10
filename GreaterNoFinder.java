import java.util.Scanner;

public class GreaterNoFinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number1: ");
        int n1= input.nextInt();
        System.out.print("Enter a number2: ");
        int n2= input.nextInt();
        System.out.print("Enter a number3: ");
        int n3= input.nextInt();

        if(n1>=n2 && n1>=n3)
            System.out.println(n1 + " is the biggest.");

        else if(n2>=n1 && n2>=n3)
            System.out.println(n2 + " is the biggest.");
        
        else if(n3>=n1 && n3>=n3)
            System.out.println(n3 + " is the biggest.");
        input.close();
    
}
}