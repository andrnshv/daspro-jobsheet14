import java.util.Scanner;

public class PowerRecursive06 {   
    static String series = "";
    static int calculatePower(int base, int pow) {
        if(pow==0) {
            series += "1";
            return 1;
        }
        else {
            series += base + "x";
            return base*calculatePower(base, pow-1);
        }
            
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input base number: ");
        int base = input.nextInt();
        System.out.print("Input power number: ");
        int power = input.nextInt();
        input.close();

        int result = calculatePower(base, power);
        System.out.print("Result of "+ series +" is "+ result);
    }
}
