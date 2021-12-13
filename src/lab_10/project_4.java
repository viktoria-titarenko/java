package lab_10;
import java.util.Scanner;
public class project_4 {  public static void main(String[] args) {
    int n;
    final double cours = 72.12;
    double dollars = 0;
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("введи число конвертаций");
        n = scanner.nextInt();
    } while (n <=0);
    for (int i=0; i < n; i++){
        System.out.println("введи dollars");
        dollars = scanner.nextDouble();
        if (dollars>= 5 && dollars <=20) {
            System.out.println("американских долларов равны");}
        else { double remainder = dollars % 10;
            if (remainder ==1 ) { System.out.println("американский доллар равен");}
            else {
                if (remainder >= 2 && remainder <= 4) {
                    System.out.println("американских доллара равны");
                } else {
                    System.out.println("американских долларов равны");
                }}}

        double rubles = rub(dollars);
        System.out.println( Math.ceil(rubles) + " российского рубля");
    }}
    public static double rub(double dollars){
    return dollars*72.12;
    }

}
