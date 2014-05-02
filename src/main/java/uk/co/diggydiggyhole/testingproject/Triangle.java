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
     * @param triangle triangle to evaluate
     * @return the type of triangle.
     */
    public static TriangleType triangleTypeBySides(Triangle triangle) {

        // The sum of any two sides must exceed the length of the third side otherwise it's not a triangle.
        if(triangle.a >= triangle.b + triangle.c || triangle.b >= triangle.a + triangle.c || triangle.c >= triangle.a + triangle.b) {
            return TriangleType.NOT_A_TRIANGLE;
        }

        //Impossible triangle.
        if(triangle.a <= 0 || triangle.b <= 0 || triangle.c <= 0) {
            return TriangleType.NOT_A_TRIANGLE;
        }
        if(triangle.a > MAX_SIZE || triangle.b > MAX_SIZE || triangle.c > MAX_SIZE) {
            return TriangleType.NOT_A_TRIANGLE;
        }

        if(triangle.a == triangle.b & triangle.a == triangle.c && triangle.b == triangle.c) {
            return TriangleType.EQUALATERAL;
        }
        if(triangle.a == triangle.b || triangle.b == triangle.c || triangle.c == triangle.a) {
            return  TriangleType.ISOSCELES;
        }
        return TriangleType.SCALENE;
    }
}
