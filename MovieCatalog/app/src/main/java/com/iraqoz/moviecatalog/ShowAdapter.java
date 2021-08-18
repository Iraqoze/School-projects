package com.iraqoz.moviecatalog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ShowAdapter extends RecyclerView.Adapter<ShowAdapter.ShowViewHolder> {

    private Show[] Shows;
    public ShowAdapter(Show[] shows){
        Shows=shows;
    }

    @Override
    public int getItemCount() {
        return Shows.length;
    }
    @NonNull
    @Override
    public ShowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_template,parent,false);
        return new ShowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShowViewHolder holder, int position) {
        holder.bind(Shows[position]);
    }


    static class ShowViewHolder extends RecyclerView.ViewHolder{

        ImageView Icon;
        TextView Title;
        TextView Description;
        public ShowViewHolder(@NonNull View itemView) {
            super(itemView);
            Icon= itemView.findViewById(R.id.image_view_item_icon);
            Title= itemView.findViewById(R.id.text_view_item_title);
            Description=itemView.findViewById(R.id.text_view_item_description);
        }
        public void bind(Show show){
            Icon.setImageResource(show.Icon);
            Title.setText(show.Title);
            Description.setText(show.Description);
        }
    }


}