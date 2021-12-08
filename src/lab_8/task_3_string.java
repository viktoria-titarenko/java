package lab_8;
import java.util.Scanner;
public class task_3_string {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String s11 = "Welcome to Java";
        String s22 = "Programming is fun";
        String s33 = "Welcome to Java";
        System.out.println(s11 == s22); System.out.println(s22 == s33);
        System.out.println(s11.equals(s22)); System.out.println(s22.equals(s33));
        System.out.println(s11.compareTo(s22)); System.out.println(s22.compareTo(s33));
        System.out.println(s22.compareTo(s22)); System.out.println(s11.charAt(0));
        System.out.println(s11.indexOf('j')); System.out.println(s11.indexOf("to"));
        System.out.println(s11.lastIndexOf('a')); System.out.println(s11.lastIndexOf("o", 15));
        System.out.println(s11.length()); System.out.println(s11.substring(5));
        System.out.println(s11.substring(5, 11)); System.out.println(s11.startsWith("Wel"));
        System.out.println(s11.endsWith("Java")); System.out.println(s11.toLowerCase());
        System.out.println(s11.toUpperCase());System.out.println(s11.concat(s22));
        System.out.println(s11.contains(s22));System.out.println("\t Wel \t".trim());

        System.out.println("Задание 2");
        System.out.println("1" + 1);
        System.out.println('1' + 1);
        System.out.println("1" + 1 + 1);
        System.out.println("1" + (1 + 1));
        System.out.println('1' + 1 + 1);

        System.out.println("Задание 3");
        String s1 = "Welcome";
        String s2 = "welcome";
        System.out.println ("(a)" + s1.equals(s2));
        System.out.println("(b)" + s1.equalsIgnoreCase(s2));
        Boolean isEqual1 = s1.equals(s2);
        int isEqual2 = isEqual1 ? 1 : 0;
        System.out.println("(c)" + isEqual2);
        Boolean isEqual = s1.equalsIgnoreCase(s2);
        int isEquall = isEqual ? 1 : 0;
        System.out.println("(d)" + isEquall);
        Boolean b = s1.startsWith("AAA");
        System.out.println("(e)" +b);
        Boolean b2 = s1.endsWith("AAA");
        System.out.println("(f)" + b2);
        int x = s1.length();
        System.out.println("(g)" + x);
        char x1 = s1.charAt(0);
        System.out.println("(h)" + x1);
        String s3 = s1.concat(s2);
        System.out.println("(i)" + s3);
        String s4 = s1.substring(1);
        System.out.println("(j)" + s4);
        String s5 = s1.substring(1,4);
        System.out.println("(k)" + s5);
        String s6 = s1.toLowerCase();
        System.out.println("(l)" + s6);
        String s7 = s1.toUpperCase();
        System.out.println("(m)" + s7);
        String s8 = s1.trim();
        System.out.println("(n)" + s8);
        int x3 = s1.indexOf("e");
        System.out.println("(o)" + x3);
        int x4 = s1.lastIndexOf("abc");
        System.out.println("(p)" + x4);

        System.out.println("Задание 4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите i ");
        int i = scanner.nextInt();
        String s = "";
        String s111= s + i;
        System.out.println(s111.length());

    }}
