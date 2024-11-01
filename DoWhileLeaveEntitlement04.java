import java.util.Scanner;

public class DoWhileLeaveEntitlement04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int leaveEntitlement, numLeave;
        // String confirmation;
        // String anotherString;

        // System.out.print("Input The Number of Leave Entitlement:  ");
        // leaveEntitlement = input.nextInt();

        // do {
        //     System.out.print("Do you want to take a leave (y/n)? ");
        //     confirmation = input.next();

        //     if (confirmation.equalsIgnoreCase("y")) {
        //         System.out.print("How many day(s)? ");
        //         numLeave = input.nextInt();

        //         if (numLeave <= leaveEntitlement) {
        //             leaveEntitlement -= numLeave;
        //             System.out.println("Remaining leave entlement:"+leaveEntitlement);
        //         } else{
        //             System.out.println("You dont have enough leave entitlement");
        //             break;
        //         }
        //     }
        // }while (leaveEntitlement > 0);



        // int leaveEntitlement, numLeave;
        // String confirmation;
        // String anotherString;

        // System.out.print("Input The Number of Leave Entitlement:  ");
        // leaveEntitlement = input.nextInt();

        // do {
        //     System.out.print("Do you want to take a leave (y/n)? ");
        //     confirmation = input.next();

        //     if (confirmation.equalsIgnoreCase("y")) {
        //         System.out.print("How many day(s)? ");
        //         numLeave = input.nextInt();

        //         if (numLeave <= leaveEntitlement) {
        //             leaveEntitlement -= numLeave;
        //             System.out.println("Remaining leave entlement:"+leaveEntitlement);
        //         } else{
        //             System.out.println("You dont have enough leave entitlement");
        //             continue;
        //         }
        //     }
        // }while (leaveEntitlement > 0);


        int leaveEntitlement, numLeave;
        String confirmation;
        String anotherString;

        System.out.print("Input The Number of Leave Entitlement:  ");
        leaveEntitlement = input.nextInt();

        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input.next();
            if (confirmation != "y" && confirmation != "n") {
                
                if (confirmation.equalsIgnoreCase("y")) {
                    System.out.print("How many day(s)? ");
                numLeave = input.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entlement:"+leaveEntitlement);
                } else{
                    System.out.println("You dont have enough leave entitlement");
                    break;
                }
            }else 
            System.out.println("not confirmation");
            
        }
        }while (leaveEntitlement > 0);


    }
}