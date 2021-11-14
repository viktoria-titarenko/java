package lab6;
import java.util.Scanner;
public class credit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double annual_rate = scanner.nextDouble();
        int term = scanner.nextInt();
        int summa = scanner.nextInt();
        double month_rate = annual_rate/12/100;
        int n = term*12;
        double monthly_interest = summa * month_rate/(1-1/Math.pow(1+month_rate,n));
        System.out.println ("ежемесячный платёж " + monthly_interest);
        double total = n * monthly_interest;
        System.out.println("стоимость кредита " + total);
    }
}
