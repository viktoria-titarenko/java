package lab_9;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку ");
        String s = scanner.nextLine();
        int low =0; int high = s.length()-1;
        Boolean answer = true;
        while(low<high){
            if (s.charAt(low)!= s.charAt(high)){
                answer = false;
                break;
            }
            low++; high--;
        }
        System.out.println(answer ? "является палиндромом" : "не является палиндромом");

    System.out.println("задание 2");
        System.out.print("Введите строку ");
        String s11 = scanner.nextLine();
        String s1="";
        int low1 =0; int high1 = s11.length()-1;
        Boolean answer1 = true;
        while(high1 >= 0){
            s1 += s11.charAt(high1);
            low1++; high1--;
        }
        System.out.println(s1);

        low1++; high1--;

    }}
