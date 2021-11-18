package lab_7;

import java.util.Scanner;

public class task_3_if1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи y");
        int y = scanner.nextInt();
        if (y > 0){
            int x = 1;
            System.out.println(x);
        }
        else {
            System.out.println("y МЕНЬШЕ 0");
        }

}}
