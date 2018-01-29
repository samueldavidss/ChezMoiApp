package com.example.samuelsanchez.chezmoiapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.samuelsanchez.chezmoiapp.Data.Nodes;
import com.example.samuelsanchez.chezmoiapp.Models.Buy;
import com.example.samuelsanchez.chezmoiapp.R;
import com.example.samuelsanchez.chezmoiapp.Views.ListenerBuy;
import com.firebase.ui.database.FirebaseRecyclerAdapter;

public class BuyAdapter extends FirebaseRecyclerAdapter<Buy, BuyAdapter.buyHolder>{



    private ListenerBuy listenerBuy;

    public BuyAdapter(ListenerBuy listenerBuy) {
        super(Buy.class,R.layout.list_item_buys,buyHolder.class, new Nodes().query());
        this.listenerBuy = listenerBuy;
    }



    @Override
    protected void populateViewHolder(buyHolder viewHolder, final Buy model, int position) {
        viewHolder.user.setText(model.user);
        viewHolder.mount.setText(model.cost);
        viewHolder.descripcion.setText(model.description);
        viewHolder.date.setText(model.date);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listenerBuy.click(model.getKey(),model.getDescription(),model.getCost(),model.getUser(),model.getDate());
            }
        });



    }

    public static class buyHolder extends RecyclerView.ViewHolder {

        TextView user, descripcion, mount, date;
        public buyHolder(View itemView) {
            super(itemView);
            user = (TextView) itemView.findViewById(R.id.userBuysTv);
            descripcion = (TextView) itemView.findViewById(R.id.descBuyEdt);
            mount= (TextView) itemView.findViewById(R.id.mountBuyEdt);
            date = (TextView) itemView.findViewById(R.id.dateBuyTv);
        }

    }


}
