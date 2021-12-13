package lab_10;

import java.util.Scanner;
public class NDS {
    public static void main(String[] args) {

        double answer = 0; String nds ="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стоимость единицы товара ");
        int price = scanner.nextInt();
        System.out.print("Введите количество товара ");
        int count = scanner.nextInt();
        System.out.print("учитываем ли НДС?(y,n) ");
        nds = scanner.next();
        System.out.println(nds == "y");
        if (nds.equals("y")) {
            if (count >= 10) {
                answer = without_nds_sale(price, count, 5, 20.0);
            } else {
                answer = without_nds_sale(price, count, 20.0);
            }
        } else if (count >= 10) {answer= without_nds_sale(price,count,5);}
        else {answer = without_nds_sale(price,count);}
        System.out.print(answer);
    }


    public static double without_nds_sale(int price, int count) {
        return price * count;
    }

    public static double without_nds_sale(int price, int count, int sale) {
        double priceWithDiscount = price * (1 - sale / 100.0) * count;
        return Math.round(priceWithDiscount);
    }

    public static double without_nds_sale(int price, int count, double nds) {
        double priceWithoutnds = price * count;
        double priceWithnds = priceWithoutnds * (1 + nds / 100);
        return Math.round(priceWithnds);
    }

    public static double without_nds_sale(int price, int count, int sale, double nds) {
        double priceWithDiscount = price * (1 - sale / 100.0) * count;
        double priceWithnds = priceWithDiscount * (1 + nds / 100);
        return price * count;
    }}
