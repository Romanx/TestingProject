/**
 * Created by Alex on 01/05/2014.
 */
public class Main {
    public static void main(String args[]) {
        Triangle T = new Triangle(1, 1, 1);

        System.out.println(Triangle.TriangleTypeBySides(T));

        System.out.println(isGreaterThan(1, 2));
        System.out.println(isGreaterThan(1, 1));
        System.out.println(isGreaterThan(2, 1));
    }

    /**
     * A simple method to return the equality of two integers.
     * @param a
     * @param b
     * @return 0 if equal, 1 if a is greater, -1 if a is less.
     */
    public static int isGreaterThan(int a, int b) {
        if(a > b) return 1;
        if(a < b) return -1;
        return 0;
    }

}
