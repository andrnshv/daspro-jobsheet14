import java.util.Scanner;

public class ProfitRecursive06 {

    static double calculateProfit(double balance, int period) {
        if(period==0)
            return balance;
        else
            return 1.11*calculateProfit(balance, period-1);
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input balance: ");
        double initialBalance = input.nextInt();
        System.out.print("Input Investment period: ");
        int investPeriod = input.nextInt();
        input.close();

        System.out.println("Balance after "+initialBalance+" year = "+calculateProfit(initialBalance, investPeriod));

    }
}
