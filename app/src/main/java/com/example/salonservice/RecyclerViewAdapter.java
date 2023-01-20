package com.example.salonservice;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    // creating variables for our list, context, interface and position.
    private ArrayList<barberModel> courseRVModalArrayList;
    private Context context;
    private ViewHolder.CourseClickInterface courseClickInterface;
    int lastPos = -1;

    public RecyclerViewAdapter(Context context, ArrayList<barberModel> courseModelArrayList) {
        this.courseRVModalArrayList = courseModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_barber, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // setting data to our recycler view item on below line.
        barberModel courseRVModal = courseRVModalArrayList.get(holder.getAdapterPosition());
        holder.shop_name.setText(courseRVModal.getShopname());
        holder.view.setText(courseRVModal.getView());
        // adding animation to recycler view item on below line.
        setAnimation(holder.itemView, holder.getAdapterPosition());


    }

    private void setAnimation(View itemView, int position) {
        if (position > lastPos) {
            // on below line we are setting animation.
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            itemView.setAnimation(animation);
            lastPos = position;
        }
    }


    @Override
    public int getItemCount() {
        // this method is used for showing number of card items in recycler view
        return courseRVModalArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView shop_name, view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            shop_name = itemView.findViewById(R.id.shop_name);
            view = itemView.findViewById(R.id.view_btn);
        }

        // creating a interface for on click
        public interface CourseClickInterface {
            void onCourseClick(int position);
        }
    }
}
