package Module4.Lecture3;

public class Circle extends Shape {
    private int radius;

    public Circle(
            int fillColor,
            int lineColor,
            int radius
    ) {
        super(fillColor, lineColor);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
