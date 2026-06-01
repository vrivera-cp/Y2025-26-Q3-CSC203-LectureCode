package Module3.Lecture2;

public class MethodDispatch {
    public static void main(String[] args) {
        ComponentVector cv = new ComponentVector(-1, 0);
        MagnitudeVector mv = new MagnitudeVector(1, 180);

        // Instance method calls prefer the
        // dynamic type's version
        IO.println(cv.getDirectionDeg());
        IO.println(mv.getDirectionDeg());

        Vector v1 = cv; // Static: Vector, Dynamic: ComponentVector
        Vector v2 = mv; // Static: Vector, Dynamic: MagnitudeVector

        IO.println(v1.getDirectionDeg());
        IO.println(v2.getDirectionDeg());

        // Passing in instances as arguments,
        // Prefer the static type of the method
        VectorUtil.printVectors(cv, mv);
        VectorUtil.printVectors(mv, cv);
        VectorUtil.printVectors(v1, v2);
        VectorUtil.printVectors(v2, v1);

        IO.println(mv.getDirectionDeg()); // Static: MagnitudeVector, Dynamic: MagnitudeVector
        IO.println(v2.getDirectionDeg()); // Static: Vector, Dynamic: MagnitudeVector

    }
}
