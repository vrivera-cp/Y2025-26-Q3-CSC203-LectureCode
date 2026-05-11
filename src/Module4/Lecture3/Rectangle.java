package Module4.Lecture3;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(
            int fillColor,
            int lineColor,
            int width,
            int height
    ) {
        super(fillColor, lineColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
