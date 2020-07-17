package DesignPatterns.Observer;

public interface Subject {
    void subscriber(Subscriber observer);

    void unsubscriber(Subscriber observer);

    void notifySubscribber();

    void upload(String title);
}
