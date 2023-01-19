import java.util.Scanner;

public class Sum_Avg_Min_Max_elements_arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array to be created:");
        int length = input.nextInt();
        int arr[] = new int[length];
        double Sum=0, Avg=0;
        int min=0,max=0,temp=0;

        System.out.println("Enter the elements: ");
        for (int i = 0; i < length; i++) arr[i] = input.nextInt();
        System.out.println();
        // Sum:
        for (int i: arr) Sum+=i;
        Avg= Sum/length;
        System.out.println("Sum: " + Sum);
        System.out.println("Avg: " + Avg);
        int i=0;
        for (i = 0; i < arr.length; i++)
            for (int j = i+1; j < arr.length; j++)
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
        min= arr[0];
        max= arr[arr.length-1];
        System.out.println("Minimum:" +min);
        System.out.println("Maximum:" +max);

    }
}
