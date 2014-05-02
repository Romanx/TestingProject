import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;
import uk.co.diggydiggyhole.testingproject.integration.ISubscriber;
import uk.co.diggydiggyhole.testingproject.integration.Publisher;

/**
 * Created by Alex on 02/05/2014.
 */
public class PublisherTest {
    @Rule
    public JUnitRuleMockery context = new JUnitRuleMockery();

    @Test
    public void singleSubscriberRecievesMessage() {
        final ISubscriber subscriber = context.mock(ISubscriber.class);

        Publisher p = new Publisher();
        p.addSubscriber(subscriber);

        final String message = "Hello World";

        context.checking(new Expectations() {{
            oneOf (subscriber).recieveMessage(message);
        }});

        p.sendMessage(message);
    }
}
