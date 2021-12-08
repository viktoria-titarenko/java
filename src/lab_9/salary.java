package lab_9;
import java.util.Scanner;
public class salary { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество сотрудников ");
    int count = scanner.nextInt();

    Double som = 0.0;
    int countt = 0;
    while (countt < count){
        System.out.print("Введите количество отработаных часов ");
        double hours = scanner.nextDouble();
        System.out.print("Введите часовую ставку ");
        Double rate = scanner.nextDouble();
        double pay = hours * rate;
        System.out.println("сотрудник " + (countt+1) + " имеет заработную плату " + pay);
        som += pay;
        countt+=1;
    }
    System.out.println("общий заработок" + som);
}

}
