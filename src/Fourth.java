import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 10;
        int x =  a + 10;
        int y = a - 10;
        int z = a % 10;

        int result = a / x * y * z;
        System.out.println(result);
    }
}
