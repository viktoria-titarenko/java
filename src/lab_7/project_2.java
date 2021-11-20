package lab_7;

import java.util.Scanner;

public class project_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи dollars");
        double dollars = scanner.nextDouble();
        final double cours = 72.12;
        if (dollars>= 5 && dollars <=20) {
            System.out.println("американских долларов равны");}
         else { double remainder = dollars % 10;
             if (remainder ==1 ) { System.out.println("американский доллар равен");}
                else { if (remainder >= 2 && remainder <=4) {
                    System.out.println("американских доллара равны");}
                    else {System.out.println("американских долларов равны");

             }
         }
        }
        double rubles = dollars * cours;
        System.out.println( Math.ceil(rubles) + "российского рубля");



    }
}
