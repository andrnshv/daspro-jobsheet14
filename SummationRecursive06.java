import java.util.Scanner;

public class SummationRecursive06
 {
    public static int sumNumber(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNumber(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the n value: ");
        int n = input.nextInt();
        input.close();

        int sum = sumNumber(n);
        System.out.println("Sum of numbers from 1 until " + n + " is: " + sum);
    }
}
