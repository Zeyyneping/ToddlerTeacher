package com.example.toddlerteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton imbtnFruitsVeggies, imbtnAnimals, imbtnHumanBody, imbtnAlphabet, imbtnNumbers, imbtnShapesandColors, imbtnDailyObjects;
    ImageButton imbtnStoryBook, imbtnBadges;
    TextView txtToddlerTeacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Definitions
        imbtnFruitsVeggies=findViewById(R.id.imgbtn_FruitsandVeggies);
        imbtnAnimals=findViewById(R.id.imgbtn_Animals);
        imbtnHumanBody=findViewById(R.id.imgbtn_HumanBody);
        imbtnAlphabet=findViewById(R.id.imgbtn_Alphabet);
        imbtnNumbers=findViewById(R.id.imgbtn_Numbers);
        imbtnShapesandColors=findViewById(R.id.imgbtn_ColorsandShapes);
        imbtnDailyObjects=findViewById(R.id.imgbtn_DailyObjects);
        imbtnStoryBook=findViewById(R.id.imgbtn_StoryBook);
        imbtnBadges=findViewById(R.id.imgbtn_Badges);
        txtToddlerTeacher=findViewById(R.id.txt_ToddlerTeacher);

        //When fruit icon clicked, it will go to that page
        imbtnFruitsVeggies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //When animal icon clicked, it will go to that page
        imbtnAnimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //When human icon clicked, it will go to that page
        imbtnHumanBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //When alphabet icon clicked, it will go to that page
        imbtnAlphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //When number icon clicked, it will go to that page
        imbtnNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //When shape icon clicked, it will go to that page
        imbtnShapesandColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //When plane icon clicked, it will go to that page
        imbtnDailyObjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //When book icon clicked, it will go to that page
        imbtnStoryBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //When badge icon clicked, it will go to that page
        imbtnBadges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}