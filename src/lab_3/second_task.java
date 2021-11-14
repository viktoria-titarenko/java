package lab_3;
import java.util.Scanner;
public class second_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long answer = 1;
        for (int i = 1; i != n+1; i++){
            answer *= i;
        }
        System.out.println(answer);

    }

}
