package com.kewo.youthservices;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.UserAdapterVH> {
    private List<CourseResponse> userResponseList;
    private Context context;
    private ClickedItem clickedItem;

    public CoursesAdapter(ClickedItem clickedItem) {
        this.clickedItem = clickedItem;
    }
    public void setData(List<CourseResponse> userResponseList){
        this.userResponseList = userResponseList;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public UserAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new CoursesAdapter.UserAdapterVH(LayoutInflater.from(context).inflate(R.layout.activity_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapterVH holder, int position) {
        CourseResponse userResponse = userResponseList.get(position);
        String title = userResponse.getFirst_name() + " " + userResponse.getLast_name();

        holder.title.setText(title);
        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedItem.ClickedUser(userResponse);
            }
        });
        holder.l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedItem.ClickedUser(userResponse);
            }
        });







    }
    public interface ClickedItem{
        public void ClickedUser(CourseResponse userResponse);
    }

    @Override
    public int getItemCount() {
        return userResponseList.size();
    }

    public class UserAdapterVH extends RecyclerView.ViewHolder {
        TextView title;
        ImageButton image;
        LinearLayout l1;

        public UserAdapterVH(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            image= itemView.findViewById(R.id.image);

            l1 = itemView.findViewById(R.id.l1);



        }
    }
}

