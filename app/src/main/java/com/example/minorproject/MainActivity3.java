package com.example.minorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private TextView textView;
    private Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.textView5);
        button = findViewById(R.id.button4);
        button1 = findViewById(R.id.button5);
    }

    public void viewdetails(View view) {
        textView.setText("Personal Information\n" +
                " Born                 =   Apr 30, 1987 (33 years)\n Birth Place      = Nagpur, Maharashtra \n Height--Role    =  BatsmanBatting \n Style                 = Right Handed Bat \n Bowling Style  =  Right-arm offbreak \n ICC Rankings   Test ODI T20 \n Batting               9      2    17 \n Bowling              -       -      -  \n  ---Career Information \n Teams      India, Deccan Chargers, India A,\n                   India Green, India U19, Mumbai,\n                   Mumbai Indians, Indians, India\n                   Blue, Board Presidents XI");
        Toast.makeText(this,"All the information is about rohit sharma",Toast.LENGTH_LONG).show();
    }

    public void byclick2(View view) {
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
}