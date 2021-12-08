package lab_7;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи год");
        int year = scanner.nextInt();
        System.out.println((year % 4==0 && year % 100 != 0) || (year % 400 == 0));
}}
