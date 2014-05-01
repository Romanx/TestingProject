import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Alex on 01/05/2014.
 */
@RunWith(Parameterized.class)
public class TriangleTest {

    private Triangle triangle;
    private TriangleType expectedType;

    public TriangleTest(float a, float b, float c, TriangleType expectedType) {
        this.triangle = new Triangle(a, b, c);
        this.expectedType = expectedType;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]
        {
            {1, 1, 1, TriangleType.EQUALATERAL}
        };
        return Arrays.asList(data);
    }


    @Test
    public void testTriangleType() {
        Assert.assertEquals(Triangle.TriangleTypeBySides(this.triangle), this.expectedType);
    }

}
