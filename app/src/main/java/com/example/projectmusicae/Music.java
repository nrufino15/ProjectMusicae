package com.example.projectmusicae;

public class Music {
    long id;
    String title;
    String subtitle;

    public Song(long musicID, String musicTitle, String musicSubtitle) {
        id=musicID;
        title=musicTitle;
        subtitle=musicSubtitle;
    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getSubtitle(){return subtitle;}
}
