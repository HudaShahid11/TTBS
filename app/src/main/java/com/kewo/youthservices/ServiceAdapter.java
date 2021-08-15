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

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.UserAdapterVH> {
    private List<ServiceResponse> userResponseList;
    private Context context;
    private ClickedItem clickedItem;

    public ServiceAdapter(ClickedItem clickedItem) {
        this.clickedItem = clickedItem;
    }
    public void setData(List<ServiceResponse> userResponseList){
        this.userResponseList = userResponseList;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public UserAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new ServiceAdapter.UserAdapterVH(LayoutInflater.from(context).inflate(R.layout.row_users,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapterVH holder, int position) {
        ServiceResponse userResponse = userResponseList.get(position);
        String title = userResponse.getFirst_name();
       // String url = userResponse.getUrl();
        //String cost = userResponse.getCost();
        //String time = userResponse.getDuration();
        //Picasso.get().load(url).into(holder.image);

        holder.title.setText(title);
//        holder.cost.setText(cost);
//        holder.time.setText(time);
//        holder.ll.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clickedItem.ClickedUser(userResponse);
//            }
//        });
//        holder.ll2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clickedItem.ClickedUser(userResponse);
//            }
//        });
//
//
//        holder.image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clickedItem.ClickedUser(userResponse);
//            }
//        });
//        holder.title.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clickedItem.ClickedUser(userResponse);
//            }
//        });
//        holder.time.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clickedItem.ClickedUser(userResponse);
//            }
//        });
//        holder.cost.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clickedItem.ClickedUser(userResponse);
//            }
//        });

    }
    public interface ClickedItem{
        public void ClickedUser(ServiceResponse userResponse);
    }

    @Override
    public int getItemCount() {
        return userResponseList.size();
    }

    public class UserAdapterVH extends RecyclerView.ViewHolder {
        TextView title,cost,time ;
        ImageButton image;
        LinearLayout ll,ll2;

        public UserAdapterVH(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
//            image= itemView.findViewById(R.id.image);
//            cost = itemView.findViewById(R.id.cost);
//            time = itemView.findViewById(R.id.time);
//            ll = itemView.findViewById(R.id.ll);
//            ll2 = itemView.findViewById(R.id.ll2);


        }
    }
}
