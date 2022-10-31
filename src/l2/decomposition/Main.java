package l2.decomposition;

import java.util.Locale;
import java.util.Scanner;

// Вводится 2 момента времени. Найти разницу между ними. Вывести "Х часов, Y минут"

public class Main {
    static final int MINUTES_IN_HOUR = 60;

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        int hour1, minute1;
        System.out.println("Момент времени 1:");
        System.out.print("часов:");
        hour1 = scanner.nextInt();
        System.out.print("минут:");
        minute1 = scanner.nextInt();

        int hour2, minute2;
        System.out.println("Момент времени 2:");
        System.out.print("часов:");
        hour2 = scanner.nextInt();
        System.out.print("минут:");
        minute2 = scanner.nextInt();

        int totalMinutes1 = hour1 * MINUTES_IN_HOUR + minute1;
        int totalMinutes2 = hour2 * MINUTES_IN_HOUR + minute2;
        int diff = Math.abs(totalMinutes1 - totalMinutes2);
        int hourDiff = diff / MINUTES_IN_HOUR;
        int minuteDiff = diff % MINUTES_IN_HOUR;

        System.out.printf("Разница %d часов, %d минут", hourDiff, minuteDiff);
    }

}