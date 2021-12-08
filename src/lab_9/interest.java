package lab_9;
import java.util.Scanner;
import java.time.LocalDate;
public class interest {
    public static void main(String[] args) {
        double sum_income=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц открытия вклада ");
        int month = scanner.nextInt();
        System.out.print("Введите год открытия вклада ");
        int year = scanner.nextInt();
        System.out.print("Введите срок вклада в месяцах ");
        int term = scanner.nextInt();
        System.out.print("Введите сумму вклада ");
        Double sum = scanner.nextDouble();
        System.out.print("Введите годовую ставку ");
        Double rate = scanner.nextDouble();
        int month_count =0;
        int i =year;
        while (month_count < term){
            for (int j =1; j<=12; j++){
                if ((i==year)&&(j <= month)) { continue;
            }
                if (month_count == term) { break;}
        int lengthMonth = LocalDate.of(i, j, 1).lengthOfMonth();
                Double income = sum * rate / 100 / 365 * lengthMonth;
                System.out.println("Начислено процентов в " + i + " году " + j + " месяца = " + income);
                 sum_income+=income;
        month_count++;
        }
        i++;
        }
        System.out.println("сумма равна " + sum_income);
    }}
