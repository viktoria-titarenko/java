package lab_7;

import java.util.Scanner;

public class task_7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи вес");
        int weight = scanner.nextInt();
        System.out.println("введи рост");
        double height = scanner.nextDouble();
        System.out.println("введи возраст");
        int age = scanner.nextInt();
        System.out.println(age>13 && age<18);
        System.out.println(weight>23 || height >152);
        System.out.println(weight>23 ^ height >152);
}}
