package com.example.projectmusicae;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MusicRecyclerAdapter extends RecyclerView.Adapter<MusicRecyclerAdapter.MusicViewHolder> {

    List<Music> list;

    MusicRecyclerAdapter(List<Music> list){
        this.list = list;
    }

    @Override
    public MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemPoem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music_list, parent, false);
        return new MusicViewHolder(itemPoem);
    }

    @Override
    public void onBindViewHolder(MusicViewHolder holder, int position) {
        Music music = list.get(position);

        holder.musicSubtitle.setText(music.title);
        holder.musicTitle.setText(music.subtitle);
    }

    @Override
    public int getItemCount() {
        return (list != null ? list.size() : 0);
    }

    class MusicViewHolder extends RecyclerView.ViewHolder {
        private TextView musicTitle;
        private TextView musicSubtitle;

        MusicViewHolder(View itemPoem) {
            super(itemPoem);
            musicTitle = itemPoem.findViewById(R.id.music_title);
            musicSubtitle = itemPoem.findViewById(R.id.music_subtitle);
        }
    }
}
