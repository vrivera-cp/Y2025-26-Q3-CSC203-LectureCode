package Module4.Lecture3;

public class Cube extends Shape3D {
    int length;

    public Cube(
            int fillColor,
            int lineColor,
            int length
    ) {
        super(fillColor, lineColor);
        this.length = length;
    }

    @Override
    public double getVolume() {
        return length * length * length;
    }

    @Override
    public double getArea() {
        return 6 * length * length;
    }
}
