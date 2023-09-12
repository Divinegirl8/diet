public class number {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;

        int result = thirdNumber;


       thirdNumber = firstNumber;
       firstNumber = secondNumber;
       secondNumber = result;


        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
    }
}
