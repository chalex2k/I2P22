package l7.task6_sample;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        runTests();
        userInput();
    }

    private static void userInput() {
        int[] a = inputArray();
        int maxSum = solution(a);
        printResult(maxSum);
    }

    private static int[] inputArray() {
        Scanner scanner = new Scanner((Readable) System.out);
        line = scanner.nextLine();
        int[] numbers2 = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

    }

    private static int solution(int[] a){
        int maxSum = a[0];
        for(int start = 0; start < a.length; start++) {
            for(int end = start + 1; end < a.length; end++) {
                int currentSum = sum(a, start, end);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;

    }

    private static int sum(int[] a, int start, int stop) {
        int s = 0;
        for( int i = start; i < stop; i++) {
            s += a[i];
        }
        return s;
    }
}
