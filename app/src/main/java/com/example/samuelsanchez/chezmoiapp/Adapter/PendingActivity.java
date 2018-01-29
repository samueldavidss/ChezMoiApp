package com.example.samuelsanchez.chezmoiapp.Adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.samuelsanchez.chezmoiapp.Main.MainActivity;
import com.example.samuelsanchez.chezmoiapp.Models.Pending;
import com.example.samuelsanchez.chezmoiapp.Queries.References;
import com.example.samuelsanchez.chezmoiapp.R;
import com.google.firebase.database.DatabaseReference;

public class PendingActivity extends AppCompatActivity {

    DatabaseReference dbRef = new References().todoReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending);
        final EditText nameEt = (EditText) findViewById(R.id.nameEt);
        final EditText valueEt = (EditText) findViewById(R.id.costEt);
    //    final EditText descriptionEt = (EditText) findViewById(R.id.descripcionEt);
      //  final EditText SiteEt = (EditText) findViewById(R.id.SiteEt);

        Button saveBtn = (Button) findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key = dbRef.push().getKey();
                Pending pending = new Pending();
              //  pending.setReference(String.valueOf(descriptionEt.getText()));
                pending.setName(String.valueOf(nameEt.getText()));
                pending.setValue(Integer.valueOf(String.valueOf(valueEt.getText())));
                //pending.setSite(String.valueOf(SiteEt.getText()));
                pending.setKey(key);
                dbRef.child(key).setValue(pending);
                Intent intent = new Intent(PendingActivity.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }




}