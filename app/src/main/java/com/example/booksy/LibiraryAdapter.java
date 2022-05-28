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

public class LibiraryAdapter extends RecyclerView.Adapter<LibiraryAdapter.LibiraryViewHolder> {
    private final Context libirarycontext;
    private List<Book> mData;

    public LibiraryAdapter(Context libirarycontext, List<Book> mData) {
       this.libirarycontext = libirarycontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public LibiraryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(libirarycontext).inflate(R.layout.activity_libirary_recycle,parent,false);
        LibiraryViewHolder holder= new LibiraryViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull LibiraryViewHolder holder, int position) {
        holder.imgBook.setImageResource(mData.get(position).getImg());
        holder.titleBook.setText(mData.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return mData.size();

    }

    public static class LibiraryViewHolder extends RecyclerView.ViewHolder{
        TextView titleBook;
        ImageView imgBook;
        public LibiraryViewHolder(@NonNull View itemView) {
            super(itemView);
            titleBook=itemView.findViewById(R.id.titleimg);
            imgBook=itemView.findViewById(R.id.img);
        }
    }
}
