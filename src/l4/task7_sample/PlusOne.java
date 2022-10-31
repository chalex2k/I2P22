package l4.task7_sample;

import java.util.Arrays;
import java.util.Scanner;

/* Задача https://leetcode.com/problems/plus-one */

public class PlusOne {
    public static int[] solution(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }
        boolean ost = true;
        for (int i = digits.length - 1; i >= 0 && ost; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                ost = false;
            }
        }
        if (ost) {
            int[] newd = new int[digits.length + 1];
            newd[0] = 1;
            for (int i = 1; i < newd.length; i++) {
                newd[i] = 0;
            }
            return newd;
        }
        return digits;
    }

    public static int[] inputIntArray(Scanner scanner) {
        String input = scanner.nextLine();
        return Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    /* Прогон и печать тестового набора входных данных */
    public static void showTests() {
        int[][] tests = {
                {1, 2, 3},
                {1},
                {1, 0},
                {1, 0, 0, 0},
                {1, 2, 3, 9},
                {1, 2, 0, 9},
                {1, 2, 9, 9},
                {9, 9, 9},
                {9},
                {9, 0, 0, 0, 0, 0, 0},
        };
        for (int[] test : tests) {
            System.out.printf("%s -> %s\n", Arrays.toString(test), Arrays.toString(solution(test)));
        }
    }

    /* Обработка пользовательского массива */
    public static void userArray() {
        System.out.print("введите массив через пробелы > ");
        Scanner scanner = new Scanner(System.in);
        int[] userArray = inputIntArray(scanner);
        System.out.printf("%s -> %s\n", Arrays.toString(userArray), Arrays.toString(solution(userArray)));
    }

    public static void main(String[] args) {
        showTests();
        userArray();
    }
}
