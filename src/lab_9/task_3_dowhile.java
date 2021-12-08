package lab_9;
import java.util.Scanner;
public class task_3_dowhile {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int x =0; int y =0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("введи первое число");
            x = scanner.nextInt();
            System.out.println("введи второе число");
            y = scanner.nextInt();
        } while ((x % y != 0) && (y % x != 0));
        System.out.println("пара найдена");

        System.out.println("Задание 2");
        int i = 1;
        do{	for (int j = 1; j<=i; j++){
            System.out.print(j);
        }
            System.out.println();
            i++;
        } while (i<=5);
        int i1=4;
        do{
            for(int j1=1; j1 <= i1; j1++){
                System.out.print(j1);
            }System.out.println();
            i1--;
        } while (i1>=1);

        System.out.println("Задание 3");
        int i11 = 0, sum = 0;
        while (i11 < 4) {
            if (i11 % 3 == 0) {
                i11++;
                continue;}
            sum += i11;
            i11++;
        } System.out.println(sum);

        System.out.println("Задание 4 continue");
        int  summ = 0;
        for (int number =0; number<20; number++){
            if((number !=10) && (number !=11)){
                summ+=number;}
        }
        System.out.println(sum);

        System.out.println("Задание 5 brake");
        int  sum1 = 0; int number =0;
        while ((number <=20) && (sum1 <= 100)){
            number++;
            sum1 +=number;
        }
        System.out.println(number + " " +sum1);
    }}
