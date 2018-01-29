package com.example.samuelsanchez.chezmoiapp.Adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.samuelsanchez.chezmoiapp.Data.CurrentUser;
import com.example.samuelsanchez.chezmoiapp.Main.MainActivity;
import com.example.samuelsanchez.chezmoiapp.Models.Buy;
import com.example.samuelsanchez.chezmoiapp.Queries.References;
import com.example.samuelsanchez.chezmoiapp.R;
import com.google.firebase.database.DatabaseReference;

import java.util.Calendar;

public class BuyActivity extends AppCompatActivity {

    DatabaseReference dbRef = new References().buyReference().child(new CurrentUser().sanitaEmail());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        final EditText descBuyEdt = (EditText) findViewById(R.id.descBuyEdt);
        final EditText mountBuyEdt = (EditText) findViewById(R.id.mountBuyEdt);
        Button buttonBuySave = (Button) findViewById(R.id.saveBuyBtn);
        buttonBuySave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String key = dbRef.push().getKey();
                Buy buy = new Buy();
                buy.setDescription(String.valueOf(descBuyEdt.getText()));
                buy.setCost(Integer.valueOf(String.valueOf(mountBuyEdt.getText())));
                buy.setUser(new CurrentUser().email());
                buy.setDate(Calendar.getInstance().getTime().toString());
                buy.setKey(key);

                dbRef.child(key).setValue(buy);
                Intent intent = new Intent(BuyActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
