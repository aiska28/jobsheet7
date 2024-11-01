import java.util.Scanner;

public class DisplayTwo04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numlnput;

        System.out.print("Input some number: ");
        numlnput = input.nextInt();

        for(int i = 2; i <= numlnput; i+=2) {
                System.out.print(i + " ");
        }
    }
}