package uk.co.diggydiggyhole.testingproject.integration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 02/05/2014.
 * Sends messages to a list of subscribers.
 */
public class Publisher {

    private List<ISubscriber> subscribers;

    public Publisher() {
        subscribers = new ArrayList<ISubscriber>();
    }

    public void addSubscriber(ISubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void sendMessage(String message) {
        for(ISubscriber subscriber : subscribers) {
            subscriber.recieveMessage(message);
        }
    }

}
