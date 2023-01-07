import java.util.Scanner;


public class Switch {
    public static void main(String[] args) {
        int day;


        Scanner console = new Scanner(System.in);


        System.out.print("Enter number 1-3 : ");
        day = console.nextInt();


        switch (day) {
            case 1:
                System.out.println("Good");

                break;

            case 2:
                System.out.println("Bad");

                break;

            case 3:
                System.out.println("Avg");

                break;

                default:
                System.out.println("Invalid input");
        }
    }
}


