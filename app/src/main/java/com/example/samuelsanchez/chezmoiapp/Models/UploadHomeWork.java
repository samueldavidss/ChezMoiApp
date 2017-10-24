package com.example.samuelsanchez.chezmoiapp.Models;

import android.content.Context;

import com.example.samuelsanchez.chezmoiapp.Data.CurrentUser;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

/**
 * Created by Samuel on 07-10-2017.
 */

public class UploadHomeWork {

    private Context  context;

    public UploadHomeWork(Context context) {
        this.context = context;
    }

    public void toFirebase(String path){

        CurrentUser currentUser = new CurrentUser();
        String folder = currentUser.sanitaEmail(currentUser.email()+"/");
        String baseUrl="gs://chezmoiapp-bd05b.appspot.com/";

    }
}
