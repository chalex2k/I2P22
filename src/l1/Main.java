package l1;

import java.util.Locale;
import java.util.Scanner;

/* Консольный ввод, вывод, переменные, типы данных */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        // Вывод на консоль
        System.out.println("Hello world!");
        System.out.print("Привет"); // без перевода строки в конце
        System.out.println(3.1415926);
        System.out.println();

        // форматированный вывод https://javarush.ru/groups/posts/1412-formatiruem-vihvod-chisel-v-java
        System.out.printf("int %d float %.1f str %s %n", 123, 5.3 / 3, "qwerty");
        System.out.printf("%10.10s | %3.3s | %5.5s |%n", "Фамилия", "сумма", "коэффициент");
        System.out.printf("%10s | %3d | %5.2f | %n", "Иванов", 12, 1.23456);
        System.out.printf("%10s | %3d | %5.2f | %n", "Петров", 6, 5.);


        // переменные
        int a;  // объявление переменной
        a = 5;  // инициализация переменной (присваивание первого значения)
        double b = 34.78; // обявление с инициализацией
        double r = Math.ceil(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        // прочитайте описания методов класса Math и попробуйте их использовать
        // https://metanit.com/java/tutorial/12.1.php
        // их можно не все пробовать, а тем более не нужно ничего учить. Но ознакомиться нужно для того,
        // чтобы иметь представления о том какие стандартные методы есть и какие они вообще могут быть, чтобы встретив
        // подобную задачу вы не городили костыли, а загуглили и использовали стандартный метод
        System.out.println(r);
        r = (a + b) * (a - b) / (a * a + b * b);
        a = 10 % 3; // остаток от деления https://www.google.com/search?q=java+остаток+от+деления
        System.out.println(a);
        int x = (int) b; // приведение значение double к int
        System.out.println(x);
        // типов данных в java гораздо больше, чем 2 рассмотренных. Кому интересно, гуглите


        // считывание данных
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод int: ");
        int q = scanner.nextInt();
        System.out.println("Ввод double: ");
        double w = scanner.nextDouble();
        System.out.printf("%d %f %n", q, w);


//         пример
        System.out.print("Введите катет: ");
        double k1 = scanner.nextDouble();
        System.out.print("Введите катет: ");
        double k2 = scanner.nextDouble();
        double h = hypotenuse(k1, k2);
        System.out.printf("Гипотенуза %.2f%n", h);
    }


    public static double hypotenuse(double k1, double k2) {
        return Math.sqrt(k1 * k1 + k2 * k2);
    }

}