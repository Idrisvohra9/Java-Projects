public class Pattern_WhileLoop {
    public static void main(String[] args) {
        int i=5,j=5;
        while(i>=1){
            while(j>=i){
                System.out.print("* ");
                j--;
            }
            i--;
            System.out.println();
        }
    }
}
