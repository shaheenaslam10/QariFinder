package com.example.shani.qarifinder.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shani.qarifinder.Adapters.RecyclerAdapter;
import com.example.shani.qarifinder.QariData;
import com.example.shani.qarifinder.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class StudentsFragment extends Fragment {

    Context context;
    QariData qariData;
    ArrayList<QariData> arrayList = new ArrayList<QariData>();
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerAdapter;
    RecyclerView.LayoutManager layoutManager;

    public StudentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_students, container, false);
        recyclerView = (RecyclerView)rootView.findViewById(R.id.recyclerView);
        String[] data = {"M.A, Islamiat , Punjab University", "Mon - Fir, 9 am to 5 pm" , "Islamic Aqard For Best Recitation ", "Islamic Aqard For Best Recitation "};
        int[] images = {R.drawable.emaillogo,R.drawable.emaillogo,R.drawable.emaillogo,R.drawable.emaillogo,};
        int i=0;
        for(String name : data){
            qariData = new QariData(images[i],name);
            arrayList.add(qariData);
        }
        recyclerAdapter = new RecyclerAdapter(arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerAdapter);



        // Inflate the layout for this fragment
        return rootView;
    }

}
