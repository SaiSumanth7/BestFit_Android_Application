package com.example.snehal.sqlitelogin1.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.snehal.sqlitelogin1.R;
import com.example.snehal.sqlitelogin1.map.MapsActivity;
import com.example.snehal.sqlitelogin1.remindermain.AddReminderActivity;
import com.example.snehal.sqlitelogin1.treatment.Treatment;

/**
 * Created by Snehal on 19-04-2018.
 */

public class UserActivity extends AppCompatActivity {

    GridLayout mainGrid;

    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);

        //set event
        setSingleEvent(mainGrid);

        TextView textViewName = findViewById(R.id.text1);
        String nameFromIntent = getIntent().getStringExtra("EMAIL");
        textViewName.setText("Welcome "+nameFromIntent);

    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i=0;i<mainGrid.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(finalI== 0) //open ToDoMain
                    {
                        Intent intent = new Intent(UserActivity.this,ToDoMain.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(UserActivity.this, "Please set activity", Toast.LENGTH_SHORT);
                    }

                    if(finalI== 1) //open Appointment
                    {
                        Intent intent = new Intent(UserActivity.this,AddReminderActivity.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(UserActivity.this, "Please set activity", Toast.LENGTH_SHORT);
                    }
                    if(finalI== 2) //open Appointment
                    {
                        Intent intent = new Intent(UserActivity.this,Treatment.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(UserActivity.this, "Please set activity", Toast.LENGTH_SHORT);
                    }

                    if(finalI== 3) //open Appointment
                    {
                        Intent intent = new Intent(UserActivity.this,MapsActivity.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(UserActivity.this, "Please set activity", Toast.LENGTH_SHORT);
                    }
                }


            });
        }
    }

}
