package l4.arrays;

import java.util.Arrays;
import java.util.Scanner;

/* Массивы. Примитивные и ссылочные типы данных */
public class Main {
    public static void main(String[] args) {
        // объявлене массивов
        int[] a = {1, 2, 4};
        int b[];
        b = new int[3];
        b[0] = 10;
        System.out.println(Arrays.toString(a));
        System.out.println(a[a.length - 1]); // последний элемент


        // двумерный массив
        int table[][] = new int[3][4];

        // заполнение
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 4; c++) {
                table[r][c] = r + c;
            }
        }

        // вывод
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < table[r].length; c++) {
                System.out.print(table[r][c]);
                System.out.print(' ');
            }
            System.out.println();
        }


        // ступенчатый массив
        int[][] stepped = new int[3][];
        stepped[0] = new int[1];
        stepped[1] = new int[2];
        stepped[2] = new int[3];

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };


        // сокращённый синтаксис цикла for для перебора элементов массива
        for (int j : a) {
            System.out.println(j);
        }

        for (int[] ss : arr) {
            ss[0] = -1;
            System.out.println(ss.length);
        }

        for (int[] ss : arr) {
            for (int i : ss) {
//                System.out.println(i);
            }
        }


        Scanner scanner = new Scanner(System.in);
        String line = "1 5 10 0";
//        String line = scanner.nextLine();

        // Считывание массива из строки чисел через пробел
        String[] lineArray = line.split(" ");
        int[] numbers = new int[lineArray.length];
        for (int i = 0; i < lineArray.length; i++) {
            numbers[i] = Integer.parseInt(lineArray[i]);
        }

        // то же самое через стрим
        int[] numbers2 = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();


        // примитивные и ссылочные типы данных
        String s1 = "qqq";
        String s2 = new String(s1);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(Arrays.toString(a));
        incrementEach(a);
        System.out.println(Arrays.toString(a)); // Массив изменился !!
        // http://www.turbopro.ru/index.php/yazyk-programmirovaniya-java/7319-tipy-dannykh
    }

    public static void incrementEach(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

}