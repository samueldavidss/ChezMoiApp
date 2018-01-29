package com.example.samuelsanchez.chezmoiapp.Views;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.samuelsanchez.chezmoiapp.Adapter.BuyAdapter;
import com.example.samuelsanchez.chezmoiapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BuyFragment extends Fragment implements ListenerBuy {


    public BuyFragment() {
        // Required empty public constructor
    }

    private BuyAdapter buyAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buy, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        buyAdapter = new BuyAdapter(this);
        recyclerView.setAdapter(buyAdapter);

    }



    @Override
    public void click(String key, String description, int cost, String user, String date) {

    }
}
