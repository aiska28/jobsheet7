import java.util.Scanner;

public class ForMultiples04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiple, sum = 0, counter = 0;

        System.out.print("Input the multiple: ");
        multiple = input.nextInt();
        
        for(int i=1; i <= 50; i++) {
            if (i % multiple == 0 ) {
                sum = sum + i;
                counter++;
            }
        }
        System.out.printf("The are %d number that are multiple of %d in renge 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d. \n", multiple, sum);
    }
}