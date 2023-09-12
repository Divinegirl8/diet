import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 6");
        int days = scan.nextInt();

        while (days > 6 ) {

            System.out.println("Enter a number between 0 and 6");
            days = scan.nextInt();

        }

        switch (days){


            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;


        }

    }

}
