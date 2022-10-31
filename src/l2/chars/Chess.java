package l2.chars;

import java.util.Scanner;

/* Пример работы с символами (char)*/

public class Chess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите клетку (например b5) > ");
        String cell1 = scanner.nextLine();
        cell1 = cell1.toLowerCase();
        char col1 = cell1.charAt(0);
        char row1 = cell1.charAt(1);
//        int row1 = a.charAt(1) - '0';
//        int row1 = Integer.parseInt(a.substring(1));
        System.out.print("Введите клетку (например d5) > ");
        String cell2 = scanner.nextLine();
        cell2 = cell2.toLowerCase();
        char col2 = cell2.charAt(0);
        char row2 = cell2.charAt(1);

        if (row1 == row2 && col1 == col2) {
            System.out.println("Одна и та же клетка");
        } else if (Math.abs(row1 - row2) <= 1 && Math.abs(col1 - col2) <= 1) {
            System.out.println("Соседние клетки");
        } else if (row1 == row2 || col1 == col2) {
            System.out.println("Клетки на одной линии");
        } else {
            System.out.println("Клетки далеко");
        }

        if (Math.abs(row1 - '6') <= 1 && Math.abs(col1 - 'b') <= 1) {
            System.out.println("Клетка 1 рядом клеткой b6");
        }
    }
}
