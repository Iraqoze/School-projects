package com.iraqoz.myportfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {

    private Project[] Projects;
    public ProjectsAdapter(Project[] projects){
        Projects=projects;
    }

    @Override
    public int getItemCount() {
        return Projects.length;
    }
    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_project,parent,false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.bind(Projects[position]);
    }


    static class ProjectViewHolder extends RecyclerView.ViewHolder{

        ImageView Icon;
        TextView Title;
        TextView Description;
        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            Icon= itemView.findViewById(R.id.image_view_project_icon);
            Title= itemView.findViewById(R.id.text_view_project_title);
            Description=itemView.findViewById(R.id.text_view_project_description);
        }
        public void bind(Project project){
            Icon.setImageResource(project.ProjectIcon);
            Title.setText(project.Title);
            Description.setText(project.Description);
        }
    }


}
