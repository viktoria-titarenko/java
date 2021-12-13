package lab_10;
import java.util.Scanner;
public class NOD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ПЕРВОЕ ЧИСЛО");
        int n1 = scanner.nextInt();
        System.out.print("Введите второе ЧИСЛО");
        int n2 = scanner.nextInt();
        int gsd1 = gsd(n1, n2);
        System.out.print(gsd1);
    }
    public static int gsd(int n, int nn){
        int gsd=1; int i =1;
        while (i <n && i<nn){
            if (n % i==0 && nn % i ==0){ gsd=i;
            }i++;}
            return gsd;
    }}
