package com.example.samuelsanchez.chezmoiapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.samuelsanchez.chezmoiapp.Data.Nodes;
import com.example.samuelsanchez.chezmoiapp.Models.Pending;
import com.example.samuelsanchez.chezmoiapp.R;
import com.example.samuelsanchez.chezmoiapp.Views.ListenerPending;
import com.firebase.ui.database.FirebaseRecyclerAdapter;

/**
 * Created by Samuel on 20-10-2017.
 */

public class PendingAdapter extends FirebaseRecyclerAdapter< Pending, PendingAdapter.pendingHolder>{

    private ListenerPending listenerPending;

    public PendingAdapter(ListenerPending  listenerPending) {
        super(Pending.class, R.layout.list_item_pendings, pendingHolder.class, new Nodes().query());
        this.listenerPending = listenerPending ;

       }

    @Override
    protected void populateViewHolder(pendingHolder viewHolder, final Pending model, int position) {
        viewHolder.name.setText(model.getName());
        viewHolder.site.setText(model.getSite());
        viewHolder.descripcion.setText(model.getReference());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listenerPending.click(model.getKey(),model.getName(),model.getReference(),model.getSite());

            }
        });

    }




    public static class pendingHolder extends RecyclerView.ViewHolder {

        TextView name,site, descripcion;
        public pendingHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.PendingsTv);
            site = (TextView) itemView.findViewById(R.id.SiteTv);
            descripcion= (TextView) itemView.findViewById(R.id.ReferenceTv);
        }




    }


}
