package l5;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        readAllLinesFromFile("src/l5/input.txt");
        writeLineInFile("src/l5/output.txt");
    }

    public static void readAllLinesFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) { // такая конструкция гарантирует,
            // что файл будет закрыт, даже если произошло исключение.
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeLineInFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            String str = "Hello";
            writer.write(str);
        }
        catch (IOException e) {
            System.out.printf("Ошибка при работе с файлом: %s", e);
            e.printStackTrace();
        }
    }

}
