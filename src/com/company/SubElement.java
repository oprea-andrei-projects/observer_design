package com.company;

public class SubElement implements Subscribers{

    private String subName;

    private AndreisYTchannel andreisYTchannel;


    public SubElement(String subName) {
        this.subName = subName;
        andreisYTchannel = new AndreisYTchannel();
    }

    @Override
    public void subscriberUpdated(Video v) {

        System.out.println(subName + " am fost notificat despre filmul " + v.getTitle());

    }
}
