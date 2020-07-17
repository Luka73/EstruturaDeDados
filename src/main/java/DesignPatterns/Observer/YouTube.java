package DesignPatterns.Observer;

public class YouTube {
    public static void main(String[] args) {
        Channel myChannel = new Channel();
        Subscriber s1 = new Subscriber("Maria");
        Subscriber s2 = new Subscriber("Pedro");
        Subscriber s3 = new Subscriber("Marta");
        Subscriber s4 = new Subscriber("Rafael");
        Subscriber s5 = new Subscriber("Jonas");

        myChannel.subscriber(s1);
        myChannel.subscriber(s2);
        myChannel.subscriber(s3);
        myChannel.subscriber(s4);
        myChannel.subscriber(s5);

        myChannel.unsubscriber(s3);

        s1.subscribeChannel(myChannel);
        s2.subscribeChannel(myChannel);
        s3.subscribeChannel(myChannel);
        s4.subscribeChannel(myChannel);
        s5.subscribeChannel(myChannel);

        myChannel.upload("How to learning programming");
    }
}
