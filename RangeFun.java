import java.util.Arrays;

public class RangeFun {
    // range function in which there is only the end required and it starts from 0:
    public int[] range(int end){
        int e = end;
        int[] range = new int[(e)];
        int i=0;

        for(int n = 0 ; n < e ; n++){
            range[i] = n;
            i++;
        }
        return range;
    }

    // range function in which starting and ending values are given as parameters:
    public int[] range(int start, int end){
        int s = start;
        int e = end;
        int[] range = new int[e - s];
        int i=0;

        for(int n = s ; n < e ; n++){
            range[i] = n;
            i++;
        }
        return range;
    }

    public int[] range(int start, int end, int step){
        int s = start;
        int e = end;
        int stp = step;

        int[] range = new int[(e - s)/stp];
        int i=0;

        for(int n = s ; n < e ; n+=stp){
            range[i] = n;
            i++;
        }
        return range;
    }
    public static void main(String[] args) {
        RangeFun run1 = new RangeFun();
        System.out.println(Arrays.toString(run1.range(5,10)));
        System.out.println();

        for(int i:run1.range(10, 100)){
            System.out.println(i);
        }
        System.out.println();
        for(int i:run1.range(100)){
            System.out.println(i);
        }
        System.out.println();
        for(int i:run1.range(2, 100,2)){
            System.out.println(i);
        }
    }
}
