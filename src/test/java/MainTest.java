import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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

}
