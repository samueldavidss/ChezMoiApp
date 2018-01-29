package com.example.samuelsanchez.chezmoiapp.Queries;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Samuel on 23-12-2017.
 */

public class References {
    public References() {
    }

    DatabaseReference firebaseDatabase = FirebaseDatabase.getInstance().getReference();

    public DatabaseReference userReference (){
        return firebaseDatabase.child("user");
    }

    public DatabaseReference todoReference(){
        return firebaseDatabase.child("Todo");
    }

    public DatabaseReference buyReference(){
        return firebaseDatabase.child("Buy");
    }


}
