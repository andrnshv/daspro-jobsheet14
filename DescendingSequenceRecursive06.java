import java.util.Scanner;

public class DescendingSequenceRecursive06 {
    public static void recursive(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        recursive(n - 1);
    }

    public static void iterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the n value: ");
        int n = input.nextInt();
        input.close();

        System.out.println("Recursive function: ");
        recursive(n);
        System.out.println();
        System.out.println("Iterative function: ");
        iterative(n);
    }
}
