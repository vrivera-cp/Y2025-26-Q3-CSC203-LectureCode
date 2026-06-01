package Module3.Lecture2;

public interface Vector {
    public static final double degPerRad = 180 / Math.PI;

    static double radToDeg(double angle) {
        return degPerRad * angle;
    }

    double getMagnitude();
    double getDirectionRad();

    default double getDirectionDeg() {
        // this: static type -> Vector, dynamic type -> ComponentVector
        return radToDeg(getDirectionRad());
    }
}
