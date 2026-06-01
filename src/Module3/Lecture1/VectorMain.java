package Module3.Lecture1;

public class VectorMain {
    public static void display(Vector v) {
        System.out.printf(
                "%.2f %.2f%n",
                v.getMagnitude(),
                v.getDirectionDeg()
        );
    }

    public static void main(String[] args) {
        ComponentVector cVector = new ComponentVector(1, 1);
        MagnitudeVector mVector = new MagnitudeVector(Math.sqrt(2), 45);

        display(cVector);
        display(mVector);

        // Default method call
        Vector vector = new MagnitudeVector(Math.sqrt(2), 45);
        vector.getDirectionDeg();
    }
}
