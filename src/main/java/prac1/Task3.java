package prac1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a;
            int b;
            try {
                System.out.print("Введите A: ");
                a = Integer.parseInt(scanner.next());
                System.out.print("Введите B: ");
                b = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: A и B должны быть целыми числами.");
                return;
            }

            int[] values = transform(a, b);
            System.out.println("A = " + values[0]);
            System.out.println("B = " + values[1]);
        }
    }

    static int[] transform(int a, int b) {
        if (a != b) {
            int sum = a + b;
            return new int[] { sum, sum };
        }
        return new int[] { 0, 0 };
    }
}
