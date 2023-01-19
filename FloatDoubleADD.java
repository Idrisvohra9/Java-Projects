import java.util.Scanner;

public class FloatDoubleADD {
    public static void main(String[] args){
        Scanner UserNum = new Scanner(System.in);

        System.out.println("Enter 2 Float Numbers:- ");
        Float f1 = UserNum.nextFloat();
        Float f2 = UserNum.nextFloat();
        Float SumFloat= f1 + f2;

        System.out.println("Enter 2 Double Numbers:- ");
        Double d1= UserNum.nextDouble();
        Double d2= UserNum.nextDouble();
        Double SumDouble= d1 + d2;
        System.out.println("The sum of two Float numbers= "+SumFloat);
        System.out.println("The sum of two Double numbers= "+SumDouble);
        UserNum.close();
    }
}
