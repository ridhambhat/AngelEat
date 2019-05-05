package com.example.ridham.angeleat;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<ListItem> listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder,final int i) {
        ListItem listItem=listItems.get(i);
        //LayoutInflater inflater;
        //View view= inflater.inflate(R.layout.fragment_home, container, false);
        viewHolder.im1.setImageResource(listItem.getImage());
        viewHolder.name.setText(listItem.getName());
        viewHolder.menu.setText(listItem.getMenu());
        //viewHolder.order.findViewById(listItem.getOrder());
        viewHolder.order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 Log.i("this","hi");

            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView im1;
        public TextView name;
        public TextView menu;
        public Button order;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            im1=(ImageView)itemView.findViewById(R.id.im1);
            name=(TextView)itemView.findViewById(R.id.name);
            menu=(TextView)itemView.findViewById(R.id.menu);
            order=(Button)itemView.findViewById(R.id.order);

        }
    }
}

