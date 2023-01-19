import java.util.Scanner;

public class table_whileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt(), i=1;

        while(i<=10){
            System.out.println(n +" x "+ i + " = " +(n*i));
            i++;
        }
        input.close();
    }
}
