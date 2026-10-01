package prac1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Программа вычисляет площадь треугольника по трем сторонам.");
        System.out.println("Формула Герона: S = sqrt(p(p-a)(p-b)(p-c)), p = (a+b+c)/2");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите сторону a: ");
            String sa = scanner.next();
            System.out.print("Введите сторону b: ");
            String sb = scanner.next();
            System.out.print("Введите сторону c: ");
            String sc = scanner.next();

            double a;
            double b;
            double c;
            try {
                a = Double.parseDouble(sa.replace(',', '.'));
                b = Double.parseDouble(sb.replace(',', '.'));
                c = Double.parseDouble(sc.replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: стороны должны быть числами.");
                return;
            }

            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Ошибка: стороны должны быть положительными.");
                return;
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Ошибка: из таких сторон нельзя построить треугольник.");
                return;
            }

            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Площадь треугольника S = %.4f%n", area);
        }
    }
}
