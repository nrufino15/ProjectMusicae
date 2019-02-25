package com.example.projectmusicae;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return musics.size();
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //map to song layout
        LinearLayout songLay = (LinearLayout)musicInf.inflate
                (R.layout.music, parent, false);
        //get title and artist views
        TextView songView = (TextView)songLay.findViewById(R.id.music_title);
        TextView artistView = (TextView)songLay.findViewById(R.id.music_subtitle);
        //get song using position
        Music currSong = musics.get(position);
        //get title and artist strings
        songView.setText(currSong.getTitle());
        artistView.setText(currSong.getSubtitle());
        //set position as tag
        songLay.setTag(position);
        return songLay;
    }

    private ArrayList<Music> musics;
    private LayoutInflater musicInf;

    public SongAdapter(Context c, ArrayList<Music> theSongs){
        musics=theSongs;
        musicInf=LayoutInflater.from(c);
    }

}
