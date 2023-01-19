import java.util.Scanner;

public class Array_of_random_values {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array to be generated: ");
        int length = input.nextInt();
        int arr[] = new int[length];
        System.out.print("Enter the range of int: ");
        int range= input.nextInt();
        int n=0;

        for (int j = 0; j < length; j++) {
            n= (int)(Math.random()*range+1);
            arr[j] = n;
        }
        System.out.println("The created array:");
        System.out.print("{");
        for (int j = 0; j < length; j++){
            System.out.print(arr[j]);
            if (j<length-1) System.out.print(",");
        }
        System.out.print("}");

    }
}
