/**
 * Created by Alex on 01/05/2014.
 */
public class Triangle {
    private final float a, b, c;
    private static final int MAX_SIZE = 200;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Takes a triangle and returns the type of triangle by the sides.
     * Min Side Length: > 0 | Max Side Length: > 200
     * @param T triangle to evaluate
     * @return the type of triangle.
     */
    public static TriangleType TriangleTypeBySides(Triangle T) {

        // The sum of any two sides must exceed the length of the third side otherwise it's not a triangle.
        if(T.a >= T.b + T.c || T.b >= T.a + T.c || T.c >= T.b + T.c) return TriangleType.NOT_A_TRIANGLE;

        return null;
    }
}
