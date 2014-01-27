package com.yiliu.simcard.util;

import java.io.File;
import java.io.FileWriter;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.yiliu.simcard.Constants;
import com.yiliu.simcard.SimCardApplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class Utility {

    private static final String TAG = "Utility";

    /**
     * Write log in file at the same time.
     * 
     * @param logType
     * @param tag
     * @param log
     */
    @SuppressLint("SimpleDateFormat")
    public static synchronized void writeLog(int logType, String tag, String log) {
        String type;
        switch (logType) {
        case Log.DEBUG:
            type = "DEBUG";
            Log.d(tag, log);
            break;
        case Log.ERROR:
            type = "ERROR";
            Log.e(tag, log);
            break;
        case Log.INFO:
            type = "INFO";
            Log.i(tag, log);
            break;
        case Log.VERBOSE:
            type = "VERBOSE";
            Log.v(tag, log);
            break;
        case Log.WARN:
            type = "WARN";
            Log.w(tag, log);
            break;
        default:
            type = "UNKNOWN";
            Log.v(tag, log);
            break;
        }
        try {
            File file = new File(Constants.APP_LOG_DIR);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            SimpleDateFormat format = new SimpleDateFormat(
                    "dd-MM-yyyy HH:mm:ss,SSS");
            fileWriter.append(String.format("%1s %2s(%3s) : %4s\r\n",
                    format.format(new Date()), tag, type, log));
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            Log.e(TAG, "writeLog: " + e.getMessage());
        }
    }

    public static void isFirstRunning() {
        SharedPreferences ref = SimCardApplication.getInstance()
                .getSharedPreferences(Constants.SIM_IDENTIFY,
                        Context.MODE_PRIVATE);
        if (ref.getBoolean("FIRST_RUNNING", true)) {
            String IMSI = SimCardUtil.getSubscriberId();
            if (IMSI == null) {
                return;
            }
            SharedPreferences.Editor editor = ref.edit();
            editor.putString("IMSI", IMSI);
            editor.putBoolean("FIRST_RUNNING", false);
            editor.commit();
        }
    }

}
