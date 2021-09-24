package com.example.minorproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class NetworkChangeReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            if (isonline(context)){
                Toast.makeText(context,"NETWORK CONNECTED",Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(context, "NO NETWORK CONNECTION", Toast.LENGTH_LONG).show();
            }
        }
        catch (NullPointerException e){
            e.printStackTrace();

        }
    }
    public boolean isonline(Context context)
    {
        try
        {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo =cm.getActiveNetworkInfo();
            return (networkInfo!=null && networkInfo.isConnected());


        }
        catch (NullPointerException e){
            e.printStackTrace();
            return false;

        }
    }
}