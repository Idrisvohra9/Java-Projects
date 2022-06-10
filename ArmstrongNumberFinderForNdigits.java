import java.util.Scanner;

public class ArmstrongNumberFinderForNdigits {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number to see if it is armstrong or not: ");
        String arm_s = input.next();
        int arm_i = Integer.parseInt(arm_s);
        // int arm_i= (int)arm_s;
        int digit, sum=0, temp;
        temp=arm_i;

        while(temp>0){
            digit=temp%10;// This gets all the digits one by one 
            sum+=Math.pow(digit,arm_s.length());//This calculates the sum of cubes of its digits. 
            temp=Math.floorDiv(temp, 10);// this detriorates the temp variable
        }

        if (sum==arm_i)
        System.out.println(arm_i + " Is An Armstrong Number");
        else
        System.out.println(arm_i + " Is Not An Armstrong Number");
        input.close();
    }
}
