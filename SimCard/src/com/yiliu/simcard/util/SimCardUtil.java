package com.yiliu.simcard.util;

import java.util.List;

import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;

import com.yiliu.simcard.SimCardApplication;

public class SimCardUtil {

    private static TelephonyManager mManager = (TelephonyManager) SimCardApplication
            .getInstance().getSystemService(Context.TELEPHONY_SERVICE);

    /**
     * Requires API level 17. Requires Permission: ACCESS_COARSE_LOCATION or
     * ACCESS_FINE_LOCATION.
     * 
     * @return
     */
    public static List<CellInfo> getAllCellInfo() {
        return mManager.getAllCellInfo();
    }

    /**
     * @return
     */
    public static int getCallState() {
        return mManager.getCallState();
    }

    public static CellLocation getCellLocation() {
        return mManager.getCellLocation();
    }

    /**
     * 0: No traffic. 1: Currently receiving IP PPP traffic. 2: Currently
     * sending IP PPP traffic. 3: Currently both sending and receiving IP PPP
     * traffic. 4: Data connection is active, but physical link is down
     * 
     * @return
     */
    public static int getDataActivity() {
        return mManager.getDataActivity();
    }

    public static int getDataState() {
        return mManager.getDataState();
    }

    /**
     * Requires Permission: READ_PHONE_STATE
     * 
     * @return Returns the unique device ID, for example, the IMEI for GSM and
     *         the MEID or ESN for CDMA phones. Return null if device ID is not
     *         available.
     */
    public static String getDeviceId() {
        return mManager.getDeviceId();
    }

    /**
     * Requires Permission: READ_PHONE_STATE
     * 
     * @return Returns the software version number for the device, for example,
     *         the IMEI/SV for GSM phones. Return null if the software version
     *         is not available.
     */
    public static String getDeviceSoftwareVersion() {
        return mManager.getDeviceSoftwareVersion();
    }

    /**
     * Requires API level 17
     * 
     * @return
     */
    public static String getGroupIdLevel1() {
        return mManager.getGroupIdLevel1();
    }

    public static String getLine1Number() {
        return mManager.getLine1Number();
    }

    /**
     * Requires API level 19
     * 
     * @return
     */
    public static String getMmsUAProfUrl() {
        return mManager.getMmsUAProfUrl();
    }

    /**
     * Requires API level 19
     * 
     * @return
     */
    public static String getMmsUserAgent() {
        return mManager.getMmsUserAgent();
    }

    public static List<NeighboringCellInfo> getNeighboringCellInfo() {
        return mManager.getNeighboringCellInfo();
    }

    public static String getNetworkCountryIso() {
        return mManager.getNetworkCountryIso();
    }

    public static String getNetworkOperator() {
        return mManager.getNetworkOperator();
    }

    public static String getNetworkOperatorName() {
        return mManager.getNetworkOperatorName();
    }

    public static int getNetworkType() {
        return mManager.getNetworkType();
    }

    public static int getPhoneType() {
        return mManager.getPhoneType();
    }

    public static String getSimCountryIso() {
        return mManager.getSimCountryIso();
    }

    public static String getSimOperator() {
        return mManager.getSimOperator();
    }

    public static String getSimOperatorName() {
        return mManager.getSimOperatorName();
    }

    public static String getSimSerialNumber() {
        return mManager.getSimSerialNumber();
    }

    public static int getSimState() {
        return mManager.getSimState();
    }

    /**
     * Requires Permission: READ_PHONE_STATE
     * 
     * @return Returns the unique subscriber ID, for example, the IMSI for a GSM
     *         phone. Return null if it is unavailable.
     */
    public static String getSubscriberId() {
        return mManager.getSubscriberId();
    }

    public static String getVoiceMailAlphaTag() {
        return mManager.getVoiceMailAlphaTag();
    }

    public static String getVoiceMailNumber() {
        return mManager.getVoiceMailNumber();
    }

}
