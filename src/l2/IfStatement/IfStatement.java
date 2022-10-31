package l2.IfStatement;

import java.util.Scanner;

/* Условный оператор */

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }

        if (num > 0) {
            System.out.println("Положительное");
            if (num % 3 == 0 && num > 100) {
                System.out.println("Больше 100 и делится на 3");
            }
        } else if (num < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }

        System.out.print("> ");
        int num2 = scanner.nextInt();
        switch (num2) {
            case 1:
                System.out.println("1");
                break;
            case 2:
            case 3:
                System.out.println("2 или 3");
                break;
            default:
                System.out.println("что-то другое");
                break;
        }
    }
}
