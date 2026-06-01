package Module3.Lecture2;

public class MagnitudeVector implements Vector {
    private double magnitude;
    private double direction; // Degrees

    public MagnitudeVector(double magnitude, double direction) {
        this.magnitude = magnitude;
        this.direction = direction;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public double getDirectionRad() {
        return direction / degPerRad;
    }

    public double getDirectionDeg() {
        return direction;
    }
}
