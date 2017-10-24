package com.example.samuelsanchez.chezmoiapp.Data;

import android.content.Context;

/**
 * Created by Samuel on 09-10-2017.
 */

public class SendData {

    private Context context;

    public SendData(Context context) {
        this.context = context;
    }

    public void toFirebases (String path){
        CurrentUser currentUser = new CurrentUser();
        String folder = currentUser.sanitaEmail(currentUser.email()+"/");

    }


}


