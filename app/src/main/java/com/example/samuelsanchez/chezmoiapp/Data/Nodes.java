package com.example.samuelsanchez.chezmoiapp.Data;

/**
 * Created by Samuel on 22-10-2017.
 */

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class Nodes {
    private DatabaseReference root = FirebaseDatabase.getInstance().getReference();


    public Query query(){

        return root.child("Todo").orderByValue();

    }





}
