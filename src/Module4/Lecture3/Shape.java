package Module4.Lecture3;

public abstract class Shape {
    private int fillColor = 0xFFFFFF;
    private int lineColor = 0x000000;

    public Shape(int fillColor, int lineColor) {
        this.fillColor = fillColor;
        this.lineColor = lineColor;
    }

    public int getFillColor() {
        return this.fillColor;
    }

    public int getLineColor() {
        return this.lineColor;
    }

    public void setFillColor(int fillColor) {
        this.fillColor = fillColor;
    }

    public void setLineColor(int lineColor) {
        this.lineColor = lineColor;
    }

    public abstract double getArea();
}
