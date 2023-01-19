import java.util.Scanner;

public class Reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse it: ");
        int n= sc.nextInt();
        int temp= n, output=0, digit;
    //     while(temp>0) {
    //         digit=temp%10;
    //         output=output*10+digit;
    //         temp/=10;
    // }
    sc.close();
    for (;temp>0;temp/=10){
        digit = temp%10;
        output=output*10+digit;
    }
    System.out.println(output);
}
}