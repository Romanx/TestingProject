package uk.co.diggydiggyhole.testingproject;

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
    public static TriangleType triangleTypeBySides(Triangle T) {

        // The sum of any two sides must exceed the length of the third side otherwise it's not a triangle.
        if(T.a >= T.b + T.c || T.b >= T.a + T.c || T.c >= T.a + T.b) return TriangleType.NOT_A_TRIANGLE;

        //Impossible triangle.
        if(T.a <= 0 || T.b <= 0 || T.c <= 0) return TriangleType.NOT_A_TRIANGLE;
        if(T.a > MAX_SIZE || T.b > MAX_SIZE || T.c > MAX_SIZE) return TriangleType.NOT_A_TRIANGLE;

        if(T.a == T.b & T.a == T.c && T.b == T.c) return TriangleType.EQUALATERAL;
        if(T.a == T.b || T.b == T.c || T.c == T.a) return  TriangleType.ISOSCELES;
        return TriangleType.SCALENE;
    }
}
