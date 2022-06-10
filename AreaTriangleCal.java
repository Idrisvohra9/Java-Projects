import java.util.Scanner;
public class AreaTriangleCal {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base of triangle:- ");
        float B = input.nextFloat();

        System.out.print("Enter Height of triangle:- ");
        float H = input.nextFloat();
    
        double area=0.5* H*B;
        System.out.print("The area of the triangle is :- " + area);
        input.close();
    }
}
