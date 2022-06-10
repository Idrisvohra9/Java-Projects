import java.util.Scanner;

public class NumToWord_conv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to convert it to word:- ");
        String Num = sc.nextLine();
        int i=0;
        while(i<=Num.length()-1){
            char digit = Num.charAt(i);
            switch(digit){
                case'0':
                System.out.print("Zero ");
                break;
                case'1':
                System.out.print("One ");
                break;
                case'2':
                System.out.print("Two ");
                break;
                case'3':
                System.out.print("Three ");
                break;
                case'4':
                System.out.print("Four ");
                break;
                case'5':
                System.out.print("Five ");
                break;
                case'6':
                System.out.print("Six ");
                break;
                case'7':
                System.out.print("Seven ");
                break;
                case'8':
                System.out.print("Eight ");
                break;
                case'9':
                System.out.print("Nine ");
                break;
                default:
                System.out.println("Please do not enter a number less than 0 or a floating number.");
                i=Num.length()-1;
            }
            i++;
        }
        sc.close();
    }
}
