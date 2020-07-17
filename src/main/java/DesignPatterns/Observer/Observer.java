package DesignPatterns.Observer;

public interface Observer {
    void update();

    void subscribeChannel(Channel channel);
}
