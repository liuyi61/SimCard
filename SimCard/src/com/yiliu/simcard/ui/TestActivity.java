package com.yiliu.simcard.ui;

import com.yiliu.simcard.Constants;
import com.yiliu.simcard.R;
import com.yiliu.simcard.util.SimCardUtil;
import com.yiliu.simcard.util.Utility;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TestActivity extends Activity {

    private final String TAG = "TestActivity";

    private Button getAllCellInfoBtn;
    private Button getCallStateBtn;
    private Button getCellLocationBtn;
    private Button getDataActivityBtn;
    private Button getDataStateBtn;
    private Button getDeviceIdBtn;
    private Button getDeviceSoftwareVersionBtn;
    private Button getGroupIdLevel1Btn;
    private Button getLine1NumberBtn;
    private Button getMmsUAProfUrlBtn;
    private Button getMmsUserAgentBtn;
    private Button getNeighboringCellInfoBtn;
    private Button getNetworkCountryIsoBtn;
    private Button getNetworkOperatorBtn;
    private Button getNetworkOperatorNameBtn;
    private Button getNetworkTypeBtn;
    private Button getPhoneTypeBtn;
    private Button getSimCountryIsoBtn;
    private Button getSimOperatorBtn;
    private Button getSimOperatorNameBtn;
    private Button getSimSerialNumberBtn;
    private Button getSimStateBtn;
    private Button getSubscriberIdBtn;
    private Button getVoiceMailAlphaTagBtn;
    private Button getVoiceMailNumberBtn;

    private Button getPreferenceFirstRunningBtn;
    private Button getPreferenceIMSIBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_ui);
        initView();
    }

    private void initView() {
        getAllCellInfoBtn = (Button) findViewById(R.id.getAllCellInfo);
        getAllCellInfoBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getAllCellInfo();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getCallStateBtn = (Button) findViewById(R.id.getCallState);
        getCallStateBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getCallState();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getCellLocationBtn = (Button) findViewById(R.id.getCellLocation);
        getCellLocationBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getCellLocation();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getDataActivityBtn = (Button) findViewById(R.id.getDataActivity);
        getDataActivityBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getDataActivity();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getDataStateBtn = (Button) findViewById(R.id.getDataState);
        getDataStateBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getDataState();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getDeviceIdBtn = (Button) findViewById(R.id.getDeviceId);
        getDeviceIdBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getDeviceId();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getDeviceIdBtn = (Button) findViewById(R.id.getDeviceId);
        getDeviceIdBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    String title = "DeviceId";
                    String value = SimCardUtil.getDeviceId();
                    String text = value == null ? stringFormat1(title)
                            : stringFormat1(title, value);
                    Toast.makeText(getApplicationContext(), text,
                            Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getDeviceSoftwareVersionBtn = (Button) findViewById(R.id.getDeviceSoftwareVersion);
        getDeviceSoftwareVersionBtn
                .setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        try {
                            String title = "DeviceSoftwareVersion";
                            String value = SimCardUtil
                                    .getDeviceSoftwareVersion();
                            String text = value == null ? stringFormat1(title)
                                    : stringFormat1(title, value);
                            Toast.makeText(getApplicationContext(), text,
                                    Toast.LENGTH_SHORT).show();
                        } catch (Exception e) {
                            Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                        }
                    }
                });

        getGroupIdLevel1Btn = (Button) findViewById(R.id.getGroupIdLevel1);
        getGroupIdLevel1Btn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getGroupIdLevel1();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getLine1NumberBtn = (Button) findViewById(R.id.getLine1Number);
        getLine1NumberBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getLine1Number();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getMmsUAProfUrlBtn = (Button) findViewById(R.id.getMmsUAProfUrl);
        getMmsUAProfUrlBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getMmsUAProfUrl();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getMmsUserAgentBtn = (Button) findViewById(R.id.getMmsUserAgent);
        getMmsUserAgentBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getMmsUserAgent();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getNeighboringCellInfoBtn = (Button) findViewById(R.id.getNeighboringCellInfo);
        getNeighboringCellInfoBtn
                .setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        try {
                            SimCardUtil.getNeighboringCellInfo();
                        } catch (Exception e) {
                            Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                        }
                    }
                });

        getNetworkCountryIsoBtn = (Button) findViewById(R.id.getNetworkCountryIso);
        getNetworkCountryIsoBtn
                .setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        try {
                            SimCardUtil.getNetworkCountryIso();
                        } catch (Exception e) {
                            Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                        }
                    }
                });

        getNetworkOperatorBtn = (Button) findViewById(R.id.getNetworkOperator);
        getNetworkOperatorBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getNetworkOperator();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getNetworkOperatorNameBtn = (Button) findViewById(R.id.getNetworkOperatorName);
        getNetworkOperatorNameBtn
                .setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        try {
                            SimCardUtil.getNetworkOperatorName();
                        } catch (Exception e) {
                            Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                        }
                    }
                });

        getNetworkTypeBtn = (Button) findViewById(R.id.getNetworkType);
        getNetworkTypeBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getNetworkType();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getPhoneTypeBtn = (Button) findViewById(R.id.getPhoneType);
        getPhoneTypeBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getPhoneType();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getSimCountryIsoBtn = (Button) findViewById(R.id.getSimCountryIso);
        getSimCountryIsoBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getSimCountryIso();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getSimOperatorBtn = (Button) findViewById(R.id.getSimOperator);
        getSimOperatorBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getSimOperator();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getSimOperatorNameBtn = (Button) findViewById(R.id.getSimOperatorName);
        getSimOperatorNameBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getSimOperatorName();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getSimSerialNumberBtn = (Button) findViewById(R.id.getSimSerialNumber);
        getSimSerialNumberBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getSimSerialNumber();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getSimStateBtn = (Button) findViewById(R.id.getSimState);
        getSimStateBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getSimState();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getSubscriberIdBtn = (Button) findViewById(R.id.getSubscriberId);
        getSubscriberIdBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    String title = "SubscriberId";
                    String value = SimCardUtil.getSubscriberId();
                    String text = value == null ? stringFormat1(title)
                            : stringFormat1(title, value);
                    Toast.makeText(getApplicationContext(), text,
                            Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getVoiceMailAlphaTagBtn = (Button) findViewById(R.id.getVoiceMailAlphaTag);
        getVoiceMailAlphaTagBtn
                .setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        try {
                            SimCardUtil.getVoiceMailAlphaTag();
                        } catch (Exception e) {
                            Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                        }
                    }
                });

        getVoiceMailNumberBtn = (Button) findViewById(R.id.getVoiceMailNumber);
        getVoiceMailNumberBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    SimCardUtil.getVoiceMailNumber();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });

        getPreferenceFirstRunningBtn = (Button) findViewById(R.id.getPreferenceFirstRunning);
        getPreferenceFirstRunningBtn
                .setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        try {
                            getPreferenceFirstRunning();
                        } catch (Exception e) {
                            Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                        }
                    }
                });

        getPreferenceIMSIBtn = (Button) findViewById(R.id.getPreferenceIMSI);
        getPreferenceIMSIBtn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    getPreferenceIMSI();
                } catch (Exception e) {
                    Utility.writeLog(Log.ERROR, TAG, e.getMessage());
                }
            }
        });
    }

    /**
     * Test TelephonyManager function, and get UNNULL value.
     * 
     * @return
     */
    private String stringFormat1(String title, String value) {
        return String.format("%s: %s", title, value);
    }

    /**
     * Test TelephonyManager function, and get NULL value.
     * 
     * @return
     */
    private String stringFormat1(String title) {
        return String.format("%s is NULL", title);
    }

    private void getPreferenceFirstRunning() {
        SharedPreferences ref = getSharedPreferences(Constants.SIM_IDENTIFY, Context.MODE_PRIVATE);
        boolean bool = ref.getBoolean("FIRST_RUNNING", true);
        Toast.makeText(getApplicationContext(), "FirstRunning is " + bool, Toast.LENGTH_SHORT).show();
    }
    
    private void getPreferenceIMSI() {
        SharedPreferences ref = getSharedPreferences(Constants.SIM_IDENTIFY, Context.MODE_PRIVATE);
        String str = ref.getString("IMSI", "");
        Toast.makeText(getApplicationContext(), "IMSI is " + str, Toast.LENGTH_SHORT).show();
    }
}
