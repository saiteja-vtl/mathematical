import java.util.Scanner;
public class Fibonacci {
    public static void FibonacciSeries(int number) {

        int firstNumber = 0;
        int secondNumber = 1;
        int i = 0;

        System.out.print(firstNumber+" ");
        System.out.print(secondNumber+" ");

        int thirdNumber;
        while (i <( number - 2)) {

            thirdNumber = firstNumber + secondNumber;
            System.out.print(thirdNumber+" ");
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int number = in.nextInt(); // Number of terms to generate

        System.out.println("Fibonacci Series up to " + number + " terms:");

        FibonacciSeries(number);
    }


}
