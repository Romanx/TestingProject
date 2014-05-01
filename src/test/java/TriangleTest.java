import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Alex on 01/05/2014.
 */
public class TriangleTest {

    @Test
    public void testTriangleType() {
        Assert.assertEquals(Triangle.TriangleTypeBySides(new Triangle(1, 1, 1)), TriangleType.EQUALATERAL);
    }

}
