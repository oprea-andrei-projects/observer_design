package com.company;

public class Main {

    public static void main(String[] args) {


        Video v1 = new Video("Gone with the wind",320);
        Video v2 = new Video("Heat",250);
        Video v3 = new Video("Terminator 1",160);

        SubElement sb1 = new SubElement("andrei");
        SubElement sb2 = new SubElement("bogdan");
        SubElement sb3 = new SubElement("cristi");
        SubElement sb4 = new SubElement("dan");
        SubElement sb5 = new SubElement("elena");

        AndreisYTchannel andreiYT = new AndreisYTchannel();

        andreiYT.addSubscribers(sb1);
        andreiYT.addSubscribers(sb2);

        andreiYT.purchaseVideo(v1);
        andreiYT.purchaseVideo(v2);


    }
}
