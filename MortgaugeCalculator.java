import java.text.NumberFormat;
import java.util.Scanner;

public class MortgaugeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        double p=scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Annual interest rate: ");
        double r=scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Period(years): ");
        double n=scanner2.nextDouble();

        n = n*12;
        r = (r/12)/100;
        double val3= Math.pow((1+r),n);

        double result = p*((r*val3)/(val3-1));

        String Mortgauge= NumberFormat.getCurrencyInstance().format(result);
        System.out.print("Mortgauge: "+Mortgauge);
    }
}
