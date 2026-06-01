package Module3.Lecture2;

public class VectorUtil {
    public static void printVectors(
            Vector v1,
            Vector v2
    ) {
        // v1: Static: Vector, Dynamic: MagnitudeVector
        System.out.printf(
            "%.2f %.2f",
            v1.getMagnitude(),
            v1.getDirectionRad()
        );
        // v2: Static: Vector, Dynamic: ComponentVector
        System.out.printf(
            "%.2f %.2f",
            v2.getMagnitude(),
            v2.getDirectionRad()
        );
    }

    public static void printVectors(
            Vector v1,
            ComponentVector v2
    ) {
        // v1: Static: Vector, Dynamic: Magnitude
        System.out.printf(
            "%.2f %.2f",
            v1.getMagnitude(),
            v1.getDirectionRad()
        );
        // v2: Static: ComponentVector, Dynamic: ComponentVector
        System.out.printf(
            "%.2f %.2f (%.0f %.0f)",
            v2.getMagnitude(),
            v2.getDirectionRad(),
            v2.getX(),
            v2.getY()
        );
    }
}
