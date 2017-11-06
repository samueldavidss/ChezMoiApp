package com.example.samuelsanchez.chezmoiapp.Views;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.samuelsanchez.chezmoiapp.Adapter.ChangeActivity;
import com.example.samuelsanchez.chezmoiapp.Adapter.PendingAdapter;
import com.example.samuelsanchez.chezmoiapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeWorkFragment extends Fragment implements ListenerPending {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private PendingAdapter adapter;

    public HomeWorkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_work, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        adapter = new PendingAdapter(this);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public void click(String key, String name, String reference, String site) {
        Intent intent = new Intent(getContext(),ChangeActivity.class);
        intent.putExtra("Key",key);
        intent.putExtra("Name" ,name);
        intent.putExtra("Description", reference);
        intent.putExtra("Site",site);
        startActivity(intent);


    }
}


