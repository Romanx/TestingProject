import generators.TriangleGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import uk.co.diggydiggyhole.testingproject.Triangle;

/**
 * Created by Alex on 02/05/2014.
 */
@RunWith(JUnit4.class)
public class TriangleAlgorithmicTest {

    @Test
    public void testTriangleArithmetic() {
        TriangleGenerator triangleGenerator = new TriangleGenerator();
        for(int i = 0; i < 100; i++ ) {
            Triangle t = triangleGenerator.next();
            Assert.assertNotNull(t);
        }
    }
}
