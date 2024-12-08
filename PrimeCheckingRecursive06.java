import java.util.Scanner;

public class PrimeCheckingRecursive06 {
    public static boolean primeChecking(int n, int i) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        
        return primeChecking(n, i + 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the n value: ");
        int n = input.nextInt();
        input.close();
        if (primeChecking(n, 3)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
         }
    }
}
