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

    @Test
    public void mutlipleSubscribersRecieveSingleMessage() {
        final ISubscriber subscriberA = context.mock(ISubscriber.class);
        final ISubscriber subscriberB = context.mock(ISubscriber.class, "SubscriberB");
        final ISubscriber subscriberC = context.mock(ISubscriber.class, "SubscriberC");

        Publisher p = new Publisher();
        p.addSubscriber(subscriberA);
        p.addSubscriber(subscriberB);
        p.addSubscriber(subscriberC);

        final String message = "Hello World";

        context.checking(new Expectations() {{
            allowing (subscriberA).recieveMessage(message);
            allowing (subscriberB).recieveMessage(message);
            allowing (subscriberC).recieveMessage(message);
        }});

        p.sendMessage(message);
    }

    @Test
    public void oneSubscriberMultipleMessages() {
        final ISubscriber subscriber = context.mock(ISubscriber.class);

        Publisher p = new Publisher();
        p.addSubscriber(subscriber);

        final String messageA = "MessageA";
        final String messageB = "MessageB";
        final String messageC = "MessageC";

        context.checking(new Expectations() {{
            oneOf (subscriber).recieveMessage(messageA);
            oneOf (subscriber).recieveMessage(messageB);
            oneOf (subscriber).recieveMessage(messageC);
        }});

        p.sendMessage(messageA);
        p.sendMessage(messageB);
        p.sendMessage(messageC);
    }
}
