package lab_3;

import java.util.Scanner;

public class fourth_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double g = 9.8;
        double h = scanner.nextDouble();
        double t = Math.sqrt(h*2/g);
        System.out.println("скорость равна " + String.format("%.2f", t));

}}

