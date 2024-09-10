package com.ulp.broadcastwifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class BroadcastWifi extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Boolean conectado = intent.getBooleanExtra("connected", false);
        if (conectado) {
            Intent intent2 = new Intent(Intent.ACTION_CALL);
            intent2.setData(Uri.parse("tel:2664553747"));
            context.startActivity(intent2);
        }

    }
}