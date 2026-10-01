package prac1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Задание 2: y = ln(2x) + lg^3(x) + sqrt(5x)");
        System.out.print("Введите x (x > 0): ");

        try (Scanner scanner = new Scanner(System.in)) {
            double x;
            try {
                x = Double.parseDouble(scanner.next().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: x должен быть числом.");
                return;
            }

            if (x <= 0) {
                System.out.println("Ошибка: x должен быть больше 0.");
                return;
            }

            double y = compute(x);
            System.out.printf("y = %.6f%n", y);
        }
    }

    static double compute(double x) {
        return Math.log(2 * x) + Math.pow(Math.log10(x), 3) + Math.sqrt(5 * x);
    }
}
