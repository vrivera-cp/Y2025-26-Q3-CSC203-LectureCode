package Module3.Lecture1;

public interface Vector {
    public static final double degPerRad = 180 / Math.PI;

    static double radToDeg(double angle) {
        return degPerRad * angle;
    }

    double getMagnitude();
    double getDirectionRad();

    default double getDirectionDeg() {
        return radToDeg(getDirectionRad());
    }
}
