import java.util.Scanner;

public class TextInput_Information {

    public static void main(String[] args) {
        int lineC=0, intC=0, charC=0;
        int n,i=0;
        char ch='a';
        Scanner s = new Scanner(System.in);

        System.out.println("Enter text:");

        while(ch != '\n'){
            String txt = s.nextLine();
            n= txt.length();
            charC = charC + n;
            ch= txt.charAt(i);
        }
        s.close();
        System.out.println("Total characters: " +charC);

    }
}