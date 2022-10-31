package l2.decomposition;

import java.util.Locale;
import java.util.Scanner;

// Вводится 2 момента времени. Найти разницу между ними. Вывести "Х часов, Y минут"

public class Decomposition {
    static final int MINUTES_IN_HOUR = 60;

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        int totalMinutes1 = inputTime(scanner, "Момент времени 1:");
        int totalMinutes2 = inputTime(scanner, "Момент времени 2:");
        int diff = Math.abs(totalMinutes1 - totalMinutes2);
        printTime(diff);
    }

    public static int toMinutes(int hour, int minute) {
        return hour * MINUTES_IN_HOUR + minute;
    }

    public static int inputTime(Scanner scanner, String prompt) {
        int hour, minute;
        System.out.println(prompt);
        System.out.print("часов: ");
        hour = scanner.nextInt();
        System.out.print("минут: ");
        minute = scanner.nextInt();
        return toMinutes(hour, minute);
    }

    public static void printTime(int minutes) {
        int hour = minutes / MINUTES_IN_HOUR;
        int minute = minutes % MINUTES_IN_HOUR;
        System.out.printf("Разница %d часов, %d минут", hour, minute);
    }
}
