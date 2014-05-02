package generators;

import net.java.quickcheck.Generator;
import net.java.quickcheck.generator.PrimitiveGenerators;
import uk.co.diggydiggyhole.testingproject.Triangle;


/**
 * Created by Alex on 02/05/2014.
 */
public class TriangleGenerator implements Generator<Triangle> {

    Generator doubleGenerator = PrimitiveGenerators.doubles(0, 200);

    @Override
    public Triangle next() {
        Double a, b, c;
        a = (Double)doubleGenerator.next();
        b = (Double)doubleGenerator.next();
        c = (Double)doubleGenerator.next();

        return new Triangle(a.floatValue(), b.floatValue(), c.floatValue());
    }
}
