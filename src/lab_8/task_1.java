package lab_8;

public class task_1 {
    public static void main(String[] args) {
        System.out.println("задание 1");
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sin(2 * Math.PI));
        System.out.println(Math.cos(2 * Math.PI));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.log(Math.E));
        System.out.println(Math.exp(1));
        System.out.println(Math.max(2, Math.min(3, 4)));
        System.out.println(Math.rint(-2.5));
        System.out.println(Math.ceil(-2.5));
        System.out.println(Math.floor(-2.5));
        System.out.println( Math.round(-2.5f));
        System.out.println(Math.round(-2.5));
        System.out.println(Math.rint(2.5));
        System.out.println(Math.ceil(2.5));
        System.out.println(Math.floor(2.5));
        System.out.println(Math.round(2.5f));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(Math.abs(-2.5)));

        System.out.println("задание 2");
        double x =Math.toRadians(47);
        System.out.println(x);

        System.out.println("задание 3");
        int random = 34 + (int)(Math.random() * 21);
        System.out.println(random);
        int random2 = (int)(Math.random() * 999);
        System.out.println(random2);
        double random3 = 5.5 + (double)(Math.random() * 50);
        System.out.println(random3);

        System.out.println("задание 4");
        System.out.println(Math.log(Math.exp(5.5)));
        System.out.println(Math.exp(Math.log(5.5)));
        System.out.println(Math.asin(Math.sin(Math.PI / 6)));
        System.out.println(Math.sin(Math.asin(Math.PI / 6)));



    }

}
