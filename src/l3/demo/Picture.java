package l3.demo;

/* пример из лабы */

public class Picture {
    // Соответствуют первому варианту задачи
    public static final Line L1 = new Line(-1, 6, 5.0 / 2);
    public static final HorizontalParabola P1 =
            new HorizontalParabola(2, 2, 1);

    public static SimpleColor getColor(double x, double y) {
// реализовать самостоятельно
        if (P1.isPointRightOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        }
        if (y < -2 && L1.isPointAboveLine(x, y)) {
            return SimpleColor.GREEN;
        }
        if (y < -2 && !L1.isPointAboveLine(x, y)) {
            return SimpleColor.YELLOW;
        }
        return SimpleColor.GRAY;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.println(getColor(x, y));
    }

    public static void main(String[] args) {
        double x = 5, y = 6.6;
        printColorForPoint(x, y);
        printColorForPoint(9, 2);
        printColorForPoint(-1, -3.6);
    }

}