package com.example.samuelsanchez.chezmoiapp.Data;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by Samuel Sanchez on 10/9/2017.
 */

public class CurrentUser {
    private FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();

    public FirebaseUser getCurrentUser() {
        return currentUser;
    }


    public String getUid(){
        return currentUser.getUid();
    }
    public String email(){

        return getCurrentUser().getEmail();
    }
    public String sanitaEmail (String email){

        return email.replace("@","AT").replace(".","DOT");

    }

}
