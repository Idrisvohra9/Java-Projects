import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n %2==0)
            System.out.println(n+" is not weired.");
            if (n<=2 && n>=5)
                System.out.println(n +" is not wierd.");
        else
            System.out.println(n+" is weired.");
        
        input.close();
    }
}
