package com.example.booksy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ForYouAdapter extends RecyclerView.Adapter<ForYouAdapter.ForYouViewHolder> {
    private Context forYouContext;
    private List<Book>forYouList;

    public ForYouAdapter(Context forYouContext, List<Book> forYouList) {
        this.forYouContext = forYouContext;
        this.forYouList = forYouList;
    }

    @NonNull
    @Override
    public ForYouViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(forYouContext).inflate(R.layout.activity_for_you_recyle,parent,false);
        ForYouViewHolder holder= new ForYouViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ForYouViewHolder holder, int position) {
    holder.forYouImg.setImageResource(forYouList.get(position).getImg());
    holder.forYouTitle.setText(forYouList.get(position).getTitle());
    holder.forYouRate.setText(forYouList.get(position).getRate());
    }

    @Override
    public int getItemCount() {
        return forYouList.size();
    }

    public static class ForYouViewHolder extends RecyclerView.ViewHolder{
        ImageView forYouImg;
        TextView forYouTitle;
        TextView forYouRate;

        public ForYouViewHolder(@NonNull View itemView) {
            super(itemView);
            forYouImg=itemView.findViewById(R.id.forYouImg);
            forYouTitle=itemView.findViewById(R.id.forYouTitle);
            forYouRate=itemView.findViewById(R.id.forYourRate);

        }
    }
}
