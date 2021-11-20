package lab_7;

import java.util.Scanner;

public class task_7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи num");
        int num = scanner.nextInt();
        System.out.println(num>1 && num <100 && num%2!=0);
    }
}
