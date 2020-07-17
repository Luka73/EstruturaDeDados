package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Subscriber> observerList = new ArrayList<Subscriber>();
    private String title;

    public String getTitle() {
        return title;
    }

    @Override
    public void subscriber(Subscriber observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscriber(Subscriber observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribber() {
        for(Subscriber s : observerList) {
            s.update();
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySubscribber();
    }
}
