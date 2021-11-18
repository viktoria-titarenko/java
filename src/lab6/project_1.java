package lab6;
import java.util.Scanner;
public class project_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи dollars");
        double dollars = scanner.nextDouble();
        final double cours = 72.12;
        double rubles = dollars * cours;
        System.out.println("сумма в рублях: " + Math.ceil(rubles));



    }
}
