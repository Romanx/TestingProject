/**
 * Created by Alex on 01/05/2014.
 */

package uk.co.diggydiggyhole.testingproject;

import uk.co.diggydiggyhole.testingproject.integration.ConsoleSubscriber;
import uk.co.diggydiggyhole.testingproject.integration.Publisher;

public class Main {
    public static void main(String args[]) {
        Triangle t = new Triangle(1, 1, 1);

        System.out.println(Triangle.triangleTypeBySides(t));

        System.out.println(isGreaterThan(1, 2));
        System.out.println(isGreaterThan(1, 1));
        System.out.println(isGreaterThan(2, 1));

        Publisher p = new Publisher();
        p.addSubscriber(new ConsoleSubscriber("Subscriber 1"));
        p.addSubscriber(new ConsoleSubscriber("Subscriber 2"));
        p.sendMessage("Ping!");
        p.addSubscriber(new ConsoleSubscriber("Subscriber 3"));
        p.sendMessage("Pong!");
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

    /**
     * Finds the mean value of the given integer array.
     * @param values integer array.
     * @return the mean value of the array as a float.
     */
    public static float findMean(int[] values) {
        if(values.length == 0) return 0f;
        float total = 0;

        for(int i = 0; i < values.length; i++)
        {
            total += values[i];
        }

        return total / (float)values.length;
    }

}
