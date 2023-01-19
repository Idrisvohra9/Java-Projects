import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean repeat= true;
        while(repeat){
            System.out.println("What operations would you like to be performed?");
            System.out.println("1. Positive number");
            System.out.println("2. Armstrong number");
            System.out.println("3. Palindrome number");
            System.out.println("4. Addition of number");
            System.out.println("5. Digit count");
            System.out.println("6. Exit");
            int ch= input.nextInt();
            if (ch ==1){
                System.out.println("Enter a number to check if its positive or not: ");
                int p_i= input.nextInt();
                if (p_i<0)
                    System.out.println("The number is negative.");
                else
                    System.out.println("The number is positive.");
                System.out.println();
            }

            else if (ch==2){
                System.out.print("Enter a number to see if its armstrong or not: ");
                int n = input.nextInt();
                int temp=n, result=0, digit=0, temp2=n;
//                counting number of digit
                while (temp>0) {
                    temp = temp / 10;
                    digit++;
                }
                while (temp2>0){
                    result+=Math.pow((temp2%10), digit); //1221 = 1^4 + 2^4 + 2^4 + 1^4
                    temp2/=10;
                }
                if (result==n)
                    System.out.println(n+" Is An Armstrong Number.");
                else
                    System.out.println(n+" Is Not An Armstrong Number");
                System.out.println();
            }
            else if (ch==3){
                System.out.print("Enter a number to see if its palindrome or not: ");
                int n = input.nextInt();
                int temp=n, sum=0,digit;
                while(temp>0){
                    digit=temp%10;
                    sum=(sum*10)+digit;
                    temp/=10;
                }
                if (sum==n)
                    System.out.println(String.format("%d Is A Palindrome Number.",n));
                else
                    System.out.println(String.format("%d Is Not A Palindrome Number.",n));
                System.out.println();
            }
            else if (ch==5){
                System.out.println("Enter a number to count its digits: ");
                String digits =input.next();
                int num = Integer.parseInt(digits);

                System.out.println(String.format("%d Int has %d digits.",num,digits.length()));
                System.out.println();
            }
            else if (ch==6)
            repeat=false;
            input.close();
        }
    }
}
