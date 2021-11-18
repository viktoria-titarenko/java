package lab_7;

import java.util.Scanner;

public class task_3_if2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи score");
        int score = scanner.nextInt();
        System.out.println("введи pay");
        double pay = scanner.nextDouble();
        if (score > 90) {pay += pay * 0.03;
        System.out.println(pay);}

    }}

