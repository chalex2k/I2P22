package l6.gui;

import java.util.Arrays;
import java.util.OptionalInt;

public class Logic {
    public static int[] stringToIntArray(String str){
        return Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    public static int findMax(int[] array){
        return Arrays.stream(array).max().getAsInt();
    }
}
