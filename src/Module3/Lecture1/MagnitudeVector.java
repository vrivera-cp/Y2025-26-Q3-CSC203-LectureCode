package Module3.Lecture1;

public class MagnitudeVector implements Vector {
    private double magnitude;
    private double direction; // Degrees

    public MagnitudeVector(double magnitude, double direction) {
        this.magnitude = magnitude;
        this.direction = direction;
    }

    @Override
    public double getMagnitude() { return magnitude; }

    @Override
    public double getDirectionRad() { return direction / degPerRad; }

    @Override
    public double getDirectionDeg() { return direction; }
}
