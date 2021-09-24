package com.example.minorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private Button button;
    BroadcastReceiver broadcastReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
       broadcastReceiver = new NetworkChangeReciever();
         registerNetworkBroadcastReciever();


}

       protected void registerNetworkBroadcastReciever(){
          if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.N){
              registerReceiver(broadcastReceiver,new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
          }
           if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
               registerReceiver(broadcastReceiver,new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
           }
       }

       protected void unregisterNetwork(){
        try {
            unregisterReceiver(broadcastReceiver);
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
       }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterNetwork();
    }

    public void byclick(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    }

