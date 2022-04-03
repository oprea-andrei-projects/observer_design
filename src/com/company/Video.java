package com.company;

import java.util.ArrayList;
import java.util.List;

public class Video {

    private String title;
    private int length;



    public Video(String title, int length) {
        this.title = title;
        this.length = length;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


}
