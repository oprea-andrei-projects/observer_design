package com.company;

import java.util.*;

public class AndreisYTchannel implements Subject{

    private List<Subscribers> subscribersList;
    private Set<Video> videoSet;
    private Video video;

    public AndreisYTchannel(){

        subscribersList = new ArrayList<>();
        videoSet = new HashSet<>();

    }



    @Override
    public void addSubscribers(Subscribers s) {

        subscribersList.add(s);

    }

    @Override
    public void removeSubcribers(Subscribers s) {

        subscribersList.remove(s);

    }

    @Override
    public void notifySubscribers(Video v) {

        for(Subscribers s: subscribersList){


            s.subscriberUpdated(v);
        }


    }

    @Override
    public void purchaseVideo(Video v) {

        int mySetLength = videoSet.size();

        videoSet.add(v);

        if(videoSet.size()>mySetLength){

            notifySubscribers(v);

        }
    }
}
