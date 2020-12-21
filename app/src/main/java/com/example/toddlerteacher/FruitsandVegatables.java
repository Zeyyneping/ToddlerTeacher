package com.example.toddlerteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FruitsandVegatables extends AppCompatActivity {

    ImageButton imbtnBackIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruitsand_vegatables);

        imbtnBackIcon=findViewById(R.id.imgbtn_BackIcon);

        imbtnBackIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack=new Intent(FruitsandVegatables.this, MainActivity.class);
                startActivity(goBack);
            }
        });
    }
}