package Module1.Lecture3;

public class ConstantsAndScope {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        System.out.println(getSquareArea(12.0));
        System.out.println(getCircleArea(12.0));
    }

    public static double getSquareArea(double length) {
        return length * CM_PER_INCH;
    }

    public static double getCircleArea(double radius) {
        final double PI = 3.14;
        radius = radius * CM_PER_INCH;
        return PI * radius * radius;
    }
}