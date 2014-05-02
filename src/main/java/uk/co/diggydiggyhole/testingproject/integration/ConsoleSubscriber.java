package uk.co.diggydiggyhole.testingproject.integration;

/**
 * Created by Alex on 02/05/2014.
 */
public class ConsoleSubscriber implements ISubscriber {
    private String name;

    public ConsoleSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void recieveMessage(String message) {
        System.out.println(name + ": " + message);
    }
}
