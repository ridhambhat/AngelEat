package com.example.ridham.angeleat;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class home extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    private LinearLayout l1;
    private ImageView add;
    int i=1;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

   // private OnFragmentInteractionListener mListener;

    public home() {
        // Required empty public constructor
    }


    public static home newInstance(String param1, String param2) {
        home fragment = new home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_home, container, false);


        l1=(LinearLayout) view.findViewById(R.id.l1);
        recyclerView=(RecyclerView) view.findViewById(R.id.r1);
        recyclerView.setHasFixedSize(true);
        final LinearLayoutManager lm1=new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(lm1);
        listItems=new ArrayList<>();

        //       ListItem listItem=new ListItem("")
        /*for(i=0;i<10;i++) {
            //String name = "Palaram";
           // String menu = "shahi paneer";
            //int image=R.drawable.p1;
            //LinearLayout l1;

            ListItem listItem=new ListItem(name,menu,image);
            listItems.add(listItem);
            //recyclerView.smoothScrollToPosition(i);
        }*/
        ListItem listItem=new ListItem("Yash","Aaloo parantha",R.drawable.a1);
        listItems.add(listItem);
        ListItem listItem1=new ListItem("Naman","Shahi paneer",R.drawable.p1);
        listItems.add(listItem1);
        ListItem listItem2=new ListItem("Ridham bavarchi","Aaloo parantha",R.drawable.a2);
        listItems.add(listItem2);
        ListItem listItem3=new ListItem("Vedu","Shahi paneer",R.drawable.p2);
        listItems.add(listItem3);
        ListItem listItem4=new ListItem("Neha","Aaloo parantha",R.drawable.a3);
        listItems.add(listItem4);
        ListItem listItem5=new ListItem("kashish","Shahi paneer",R.drawable.p3);
        listItems.add(listItem5);
        ListItem listItem6=new ListItem("prince","Aaloo parantha",R.drawable.a4);
        listItems.add(listItem6);
        ListItem listItem7=new ListItem("simran","Shahi paneer",R.drawable.p4);
        listItems.add(listItem7);
        ListItem listItem8=new ListItem("ria","Aaloo parantha",R.drawable.a5);
        listItems.add(listItem8);
        ListItem listItem9=new ListItem("riya","Shahi paneer",R.drawable.p5);
        listItems.add(listItem9);
        ListItem listItem10=new ListItem("manmeet","Aaloo parantha",R.drawable.a6);
        listItems.add(listItem10);
        ListItem listItem11=new ListItem("sahil","Shahi paneer",R.drawable.p6);
        listItems.add(listItem11);
        ListItem listItem12=new ListItem("gsm","Aaloo parantha",R.drawable.a7);
        listItems.add(listItem12);
        ListItem listItem13=new ListItem("abhishek","Shahi paneer",R.drawable.p7);
        listItems.add(listItem13);
        ListItem listItem14=new ListItem("rishab","Aaloo parantha",R.drawable.a8);
        listItems.add(listItem14);
        ListItem listItem15=new ListItem("Rahul","Shahi paneer",R.drawable.p8);
        listItems.add(listItem15);

        adapter=new MyAdapter(listItems,getContext());
        recyclerView.setAdapter(adapter);



        return view;
    }



}
