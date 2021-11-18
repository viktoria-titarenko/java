package lab_7;

import java.util.Scanner;

public class task_3_if3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи x");
        int x = scanner.nextInt();
        System.out.println("введи product");
        int product = scanner.nextInt();
        if (x != 0) {
            product *= x;
            System.out.println(product);
        } else {System.out.println(product);}}

}
