package com.example.samuelsanchez.chezmoiapp.Adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.samuelsanchez.chezmoiapp.Main.MainActivity;
import com.example.samuelsanchez.chezmoiapp.Models.Pending;
import com.example.samuelsanchez.chezmoiapp.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ChangeActivity extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference dbRef = firebaseDatabase.getReference().getRef().child("tarea");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);
        final String key = getIntent().getStringExtra("Key");
        String name = getIntent().getStringExtra("Name");
        String description = getIntent().getStringExtra("Description");
        String site = getIntent().getStringExtra("Site");



        final EditText namechangeEt = (EditText) findViewById(R.id.nameChangeET);
        final EditText descriptionEt = (EditText) findViewById(R.id.descripcionChangeEt);
        final EditText siteEt = (EditText) findViewById(R.id.SiteChangeEt);

        namechangeEt.setText(name);
        descriptionEt.setText(description);
        siteEt.setText(site);

        Button changeBtn = (Button) findViewById(R.id.changeBtn);

        changeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Pending pending = new Pending();
                pending.setReference(String.valueOf(namechangeEt.getText()));
                pending.setName(String.valueOf(descriptionEt.getText()));
                pending.setSite(String.valueOf(siteEt.getText()));
                pending.setKey(key);
                dbRef.child(key).setValue(pending);
                Intent intent = new Intent(ChangeActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
