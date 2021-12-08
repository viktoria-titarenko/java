package lab_8;

public class task_2_char {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int ascii = (int) '1';
        System.out.println(ascii);
        int ascii2 = (int) 'A';
        System.out.println(ascii2);
        int ascii3 = (int) 'B';
        System.out.println(ascii3);
        int ascii4 = (int) 'a';
        System.out.println(ascii4);
        int ascii5 = (int) 'b';
        System.out.println(ascii5);

        System.out.println("Задание 2");
        char character6 = (char) 40;
        System.out.println(character6);
        char character7 = (char) 59;
        System.out.println(character7);
        char character8 = (char) 79;
        System.out.println(character8);
        char character9 = (char) 85;
        System.out.println(character9);
        char character10 = (char) 90;
        System.out.println(character10);

        System.out.println("Задание 3");
        char character11 = (char)0X40;
        System.out.println(character11);
        char character12 = (char)0X5A;
        System.out.println(character12);
        char character13 = (char)0X71;
        System.out.println(character13);
        char character14 = (char)0X72;
        System.out.println(character14);
        char character15 = (char)0X7A;
        System.out.println(character15);

        System.out.println("Задание 4");
        int i = '1';
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
        int k = 'a';
        char c = 90;
        System.out.println("i=" + i +" j="  + j + " k=" + k +" c=" + c);

        System.out.println("Задание 5");
        int random = 97 + (int)(Math.random() * 25);
        System.out.println((char) random);

        System.out.println("Задание 6");
        System.out.println('a' < 'b');
        System.out.println('a' <= 'A');
        System.out.println('a' > 'b');
        System.out.println('a' >= 'A');
        System.out.println('a' == 'a');
        System.out.println('a' != 'b');






    }
}
