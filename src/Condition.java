import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        days();

    }

    public  static void days() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 6: ");
        int day = scan.nextInt();



        switch (day){


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

            default:
                days();

        }


    }
}
