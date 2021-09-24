package com.example.minorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    private TextView textView;
    private Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        textView = findViewById(R.id.textView6);
        button = findViewById(R.id.button8);
        button1 = findViewById(R.id.button9);
    }

    public void showfacts(View view) {
        Toast.makeText(this,"All the facts are about Rohit sharma",Toast.LENGTH_LONG).show();
        textView.setText(" 1.Rohit Sharma can fluently converse in four\n    languages- English, Hindi, Marathi and Telugu. \n 2.Rohit Sharma began his career as an\n    Off-Spinner. \n 3. Rohit Sharma Idol  -Virender Sehwag \n 4.Three double Tons in ODI history \n 5.Highest Individual Score in ODI History \n 6.First Skipper to won Five IPL titles \n 7.Fastest Indian batsman to score a century in\n    T20Is \n 8.First batsman to score 3 centuries in all\n    formats \n 9.Rohit Sharma has scored a century in his\n    Test cricket debut \n 10. Rohit has 5 Centuries in 2019 World cup.");
    }

    public void byclick3(View view) {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}