package com.yiliu.simcard;

import android.os.Environment;

public class Constants {

    /**
     * SD card direction.
     */
    public static final String SD_DIR = Environment
            .getExternalStorageDirectory().toString();
    /**
     * App direction.
     */
    public static final String APP_DIR = SD_DIR + "/SimCard";
    /**
     * App log direction.
     */
    public static final String APP_LOG_DIR = APP_DIR + "/client.log";

    public static final String SIM_IDENTIFY = "sim_identify";
}
