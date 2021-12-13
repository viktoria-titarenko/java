package lab_10;

public class task_2 {
    public static void main(String[] args) {
        nPrintln(5, "Welcome to Java!");
    }
    public static void nPrintln(int n, String message) {
        for (int i = 0; i < n; i++)
            System.out.println(message);
    }
}
