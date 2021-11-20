package lab_7;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи вес");
        int weight = scanner.nextInt();
        System.out.println("введи рост");
       double height = scanner.nextDouble();
        height /= 100;
        double bmi = weight /( (height*height ));
        System.out.println(bmi);
        if (bmi < 18.5) {
            System.out.println("НЕДОСТАТОЧНЫЙ ВЕС");
        } else if (bmi < 25) {
            System.out.println("норма");
        } else if (bmi < 30) {
            System.out.println("избыточный вес");
        } else {
            System.out.println("ожирение");
        }
    }
}
