package com.yiliu.simcard;

import com.yiliu.simcard.ui.MainActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootBroadcastReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("TTTTTT", "BOOT!");
        Intent intent2 = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

}
