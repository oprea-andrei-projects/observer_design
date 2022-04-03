package com.company;

public interface Subject {

    void addSubscribers(Subscribers s);
    void removeSubcribers(Subscribers s);
    void notifySubscribers(Video v);
    void purchaseVideo(Video v);


}
