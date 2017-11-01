package com.example.samuelsanchez.chezmoiapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.samuelsanchez.chezmoiapp.Data.Nodes;
import com.example.samuelsanchez.chezmoiapp.Models.Pending;
import com.example.samuelsanchez.chezmoiapp.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;

/**
 * Created by Samuel on 20-10-2017.
 */

public class PendingAdapter extends FirebaseRecyclerAdapter< Pending, PendingAdapter.pendingHolder>{

    public PendingAdapter() {
        super(Pending.class, R.layout.list_item_pendings, pendingHolder.class, new Nodes().query());
       }

    @Override
    protected void populateViewHolder(pendingHolder viewHolder, Pending model, int position) {
        viewHolder.name.setText(model.getName());
        viewHolder.descripcion.setText(model.getReference());

    }

    public static class pendingHolder extends RecyclerView.ViewHolder {

        TextView name,local, descripcion;
        public pendingHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.PendingsTv);
            //local=itemView.findViewById(R.id.);
            descripcion= (TextView) itemView.findViewById(R.id.ReferenceTv);
        }
    }


}
