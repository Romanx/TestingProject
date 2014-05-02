import net.java.quickcheck.generator.support.IntegerGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import uk.co.diggydiggyhole.testingproject.Main;
import static net.java.quickcheck.generator.CombinedGeneratorsIterables.someIntArrays;


/**
 * Created by Alex on 01/05/2014.
 */
@RunWith(JUnit4.class)
public class MainTest {

    @Test
    public void greaterThanTest() {
        Assert.assertEquals(Main.isGreaterThan(1, 2), -1);
        Assert.assertEquals(Main.isGreaterThan(2, 1), 1);
        Assert.assertEquals(Main.isGreaterThan(1, 1), 0);

        Assert.assertEquals(Main.isGreaterThan(200000, 2), 1);
        Assert.assertEquals(Main.isGreaterThan(-1, 1), -1);
        Assert.assertEquals(Main.isGreaterThan(600, 600), 0);
    }

    @Test
    public void findMeanTest() {
        Assert.assertEquals(Main.findMean(new int[] {}), 0f, 0f);
        Assert.assertEquals(Main.findMean(new int[] {5}), 5.0f, 0f);
        Assert.assertEquals(Main.findMean(new int[] {1, 2, 3, 4, 5 }), 3.0f, 0.01f);
        Assert.assertEquals(Main.findMean(new int[] {100, 3, 30, 92, 76 }), 60.2f, 0.01f);
        Assert.assertEquals(Main.findMean(new int[] {-1, 123, 99 }), 73.66f, 0.01f);
    }

    @Test
    public void findMeanAlegbraicTest() {
        for(int[] integers : someIntArrays(new IntegerGenerator(0, 50))) {
            Assert.assertNotNull(Main.findMean(integers));
        }
    }

}
