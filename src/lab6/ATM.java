package lab6;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
    int _5000rub, _2000rub, _1000rub, _500rub, _200rub, _100rub, _50rub;
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        _5000rub = money / 5000;
        money = money % 5000;
        _2000rub = money / 2000;
        money = money % 2000;
        _1000rub = money / 1000;
        money = money % 1000;
        _500rub = money / 500;
        money = money % 500;
        _200rub = money / 200;
        money = money % 200;
        _100rub = money / 100;
        money = money % 100;
        _50rub = money / 50;
        money = money % 50;
        System.out.println(_5000rub + ": 5 тыс; " + _2000rub + ": 2 тыс; " + _1000rub + ": 1 тыс; " + _500rub +
                ": 500 руб; " + _200rub + ": 200 руб; " + _100rub + ": 100 руб; " + _50rub + ": 50 руб; ");
}}
