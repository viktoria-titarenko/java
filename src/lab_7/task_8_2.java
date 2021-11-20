package lab_7;

import java.util.Scanner;

public class task_8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи x");
        int x = scanner.nextInt();
        System.out.println("введи scale");
        int scale = scanner.nextInt();
        if (x > 10) {
            int score = scale * 3;
            System.out.println(score);
        } else {
            int score = scale * 3;
            System.out.println(score);
        }

        System.out.println("введи incom");
        int incom = scanner.nextInt();
        if (incom > 10000) {
            double tax = incom * 0.3;
            System.out.println(tax);
        } else {
            double tax = incom * 0.17 + 100;
            System.out.println(tax);
        }
        System.out.println("введи number");
        int number = scanner.nextInt();
        if (number % 3 == 0) {
            System.out.println("i");
        } else {
            System.out.println("j");
        }

    }
}
