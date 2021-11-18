package lab_7;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи r");
        int r = scanner.nextInt();
        if (r < 0) {
            System.out.println("некорректные данные");
        }
        else { double s = r*r*3.14;
            System.out.println(s);
            }
}}
