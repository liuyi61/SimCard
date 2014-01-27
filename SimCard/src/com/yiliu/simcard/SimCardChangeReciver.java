package com.yiliu.simcard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

import com.yiliu.simcard.util.SimCardUtil;
import com.yiliu.simcard.util.Utility;

public class SimCardChangeReciver extends BroadcastReceiver {

    private final String TAG = "SimCardChangeReciver";

    private SharedPreferences mRef;
    private SharedPreferences.Editor mEditor;
    private String new_IMSI;
    private String old_IMSI;

    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            new_IMSI = SimCardUtil.getSubscriberId();
            if (new_IMSI == null) {
                return;
            }
            switch (SimCardUtil.getSimState()) {
            case TelephonyManager.SIM_STATE_READY:
                mRef = context.getSharedPreferences(Constants.SIM_IDENTIFY,
                        Context.MODE_PRIVATE);
                old_IMSI = mRef.getString("IMSI", "");
                if (new_IMSI.equalsIgnoreCase(old_IMSI)) {
                    return;
                }
                mEditor.putString("IMSI", new_IMSI);
                mEditor.commit();
                Toast.makeText(context, "New IMSI: " + new_IMSI,
                        Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
            }
        } catch (Exception e) {
            Utility.writeLog(Log.ERROR, TAG, e.getMessage());
        }
    }
}
