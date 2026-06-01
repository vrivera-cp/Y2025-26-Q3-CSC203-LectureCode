package Module3.Lecture1;

public class ComponentVector implements Vector {
    private double x;
    private double y;

    public ComponentVector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getMagnitude() {

        return Math.sqrt(x * x + y * y);
    }

    @Override
    public double getDirectionRad() {
        return Math.atan2(y, x);
    }

    public double getX() { return x; }
    public double getY() { return y; }
}
