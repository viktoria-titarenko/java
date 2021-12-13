package lab_4;

public class task_2 {
    public static void main(String[] args) {
        double sum = 1;
        for (int i = 2; i <= 10000; i++) {
            if (i % 2 == 0) {
                System.out.println(Math.pow(i, -1) + " here ");
                sum -= Math.pow(i, -1);
                continue;
            }
            System.out.println(Math.pow(i, -1) + " plus ");
            sum += Math.pow(i, -1);
        }
        System.out.println(sum);
    }
}
//0.6930971830599583