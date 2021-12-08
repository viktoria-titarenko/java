package lab_9;
import java.util.Scanner;
public class task_1_while {
    public static void main(String[] args) {
    System.out.println("Задание 1");
    int i = 0;
      	while (i <= 5) {
        System.out.println( i + " " + (10 - i));
        ++i;}

    System.out.println("Задание 2");
        int even = 0; int n = 8;
        while (even < n) {
            System.out.println(even);
            even += 2;
        }

    System.out.println("Задание 3");
        int y=0;
        while(y < 7){
            System.out.println(y + " " + (int)Math.pow(2,y));
            y +=1;
        }

    System.out.println("Задание 4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n ");
        int n1 = scanner.nextInt();
        int count = 0; int sum =0;
        while (count < n1){
            sum += count;
            count+=1;
        }
        System.out.println(sum);
        System.out.println(sum == (n1*(n1-1))/2);




    }}
