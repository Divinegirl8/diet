import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 10;
        int remain = value % 10;
        int result = remain + value;
        System.out.println(result);

    }
}
