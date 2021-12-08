package lab_9;
import java.util.Scanner;
public class task_2_for {
    public static void main(String[] args) {
    System.out.println("Задание 1");
        int n = 8; int sum =0; int odd;
        for (odd = 1; odd < n; odd += 2)
            sum += odd;
        System.out.println(sum + " " + odd);

    System.out.println("Задание 2");
        int j = 10; int i;
        for (i = 0; i <= 5; ++i) {
            System.out.println(i + " " + j);
            j -= 2;
        }
    System.out.println("Задание 3");
        int i1;
        for (i1=0; i1<101; i1++){
            if (i1 % 4 == 0) {System.out.println(i1);
            }}

        System.out.println("Задание 4");
        double count = 9870; int i2;
        for (i2 =1; count<=30000;i++){
            count += count * 0.1;
        }System.out.println("за " + i + " лет");

    System.out.println("Задание 5");
        System.out.print("Введите n");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(); int p =1;
        while (n1 > 0){
            p*=n1; n1--;
        }System.out.println(p);

        System.out.println("Задание 6");
        int stop =0; int score = 1; int cout_pozitiv=0; int count_negativ=0;
        while (score != stop) {
            System.out.print("Введите число или 0 для выхода");
            score = scanner.nextInt();
            if (score > 0) {
                cout_pozitiv +=1;
            }
            if(score < 0) count_negativ +=1;
        }
        System.out.println(" количество положительных " + cout_pozitiv +" количество отрицательных " +count_negativ);

    }}
