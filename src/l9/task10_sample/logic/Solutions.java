package l9.task10_sample.logic;

import java.awt.*;
import java.util.ArrayList;

public class Solutions {
    public static void main(String[] args) {
//        tests();
        ArrayList<Segment> segments = new ArrayList<Segment>();
        segments.add(new Segment(3, 5));
        segments.add(new Segment(7, 10));
        segments.add(new Segment(13, 15));
        segments.add(new Segment(10, 15));

        int maxIntersection = 0;
        for (Segment s1 : segments) {
            for (Segment s2 : segments) {
                int intersection = calcIntersection(s1, s2);
                if (intersection > maxIntersection) {
                    maxIntersection = intersection;
                }
            }
        }
        System.out.println(maxIntersection);
    }

    private static void tests() {
        int[][] testsValues = {
                {5, 6, 8, 10, 3},
                {0, 6, 4, 10, 10},
        };

        Segment s1 = new Segment(5, 6);
        Segment s2 = new Segment(8, 10);
        int lenghIntersection = calcIntersection(s1, s2);
        System.out.println(lenghIntersection == 3);

        s1 = new Segment(0, 6);
        s2 = new Segment(4, 10);
        lenghIntersection = calcIntersection(s1, s2);
        System.out.println(lenghIntersection == 10);
    }

    private static int calcIntersection(Segment s1, Segment s2) {
        Segment first, second;
        if (s1.begin < s2.begin) {
            first = s1;
            second = s2;
        }
        else {
            first = s2;
            second = s1;
        }

        if (first.end >= second.begin) { // пересекаются
            return Math.max(s1.end, s2.end) - Math.min(s1.begin, s2.begin);
        }
        else {// не пересекаются
            return (s1.end - s1.begin) + (s2.end - s2.begin);
        }
    }
}
