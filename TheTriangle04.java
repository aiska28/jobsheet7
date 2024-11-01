import java.util.Scanner;

public class TheTriangle04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numlnput;
        int i = 0;
        String s = ""; //emy string

        System.out.print("Input some number: ");
        numlnput = input.nextInt();

        //while (i < numInput) {
        //     s += " *";
        //     System.out.println(s);
        //     i++
        // }

        for (i=0; i < numlnput; i++) {
            s += " *";
            System.out.println(s);
        }
    }
}