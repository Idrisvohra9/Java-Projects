// package Java Projects;
import java.util.Scanner;

public class Elem_even_odd_checker_arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array to be made: ");
        int length = input.nextInt();
        int arr[] = new int[length];
        System.out.print("Enter integers to check if they are even or odd: ");
        // Inserting the elements:
        for(int i = 0; i < length; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("Even elements: ");
        for (int n: arr) if (n%2==0) System.out.print(n + " ");

        System.out.println();

        System.out.print("Odd elements: ");
        for (int n: arr) if (n%2!=0) System.out.print(n + " ");
    }
}
