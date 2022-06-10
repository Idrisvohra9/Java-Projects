import java.util.Scanner;

public class Ascend_Descend_Order_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenght of array to be made:");
        int length = input.nextInt();
        int temp;
        int arr[] = new int[length];

        System.out.println("Enter the elements: ");
        // Entering the elements in the array:
        for (int i = 0; i < length; i++) arr[i] = input.nextInt();

        // Printing the Original Array:
        System.out.println("Original array:");
        System.out.print("{");
        for (int i = 0; i < length; i++){
            System.out.print(arr[i]);
            if (i < length-1) System.out.print(",");
            else break;
        }
        System.out.println("}");

        System.out.println();
        // For arranging the elements in array in Ascending order:
        for (int j = 0; j < length; j++){
            for (int k= j+1; k < length; k++){
                if (arr[j] > arr[k]){
                    temp= arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        // Printing the elements:
        System.out.println("Ascending Order: ");
        System.out.print("{");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) System.out.print(",");
            else break;
        }
        System.out.println("}");
        
        System.out.println();
        // For arranging the elements in array in Descending order:
        for (int j = 0; j < length; j++){
            for (int k= j+1; k < length; k++){
                if (arr[j] < arr[k]){
                    temp= arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Descending Order: ");
        System.out.print("{");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) System.out.print(",");
            else break;
        }
        System.out.print("}");
    }
}