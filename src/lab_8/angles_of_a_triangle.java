package lab_8;

import java.util.Scanner;

public class angles_of_a_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи координаты 1 вершины");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("введи координаты 2 вершины");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("введи координаты 3 вершины");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double angle_a = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double angle_b = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double angle_c = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
        System.out.println(Math.round(angle_a) + ", " + Math.round(angle_b) + ", " + Math.round(angle_c));
    }}
