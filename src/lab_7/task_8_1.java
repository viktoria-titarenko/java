package lab_7;

import java.util.Scanner;

public class task_8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи возраст");
        int age = scanner.nextInt();
        int price = (age >= 16) ? 20 : 10;
        System.out.println(price);
    }
}