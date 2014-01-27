package com.yiliu.simcard.ui;

import com.yiliu.simcard.R;
import com.yiliu.simcard.R.layout;
import com.yiliu.simcard.R.menu;
import com.yiliu.simcard.util.SimCardUtil;
import com.yiliu.simcard.util.Utility;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            Utility.isFirstRunning();
        } catch (Exception e) {
            Utility.writeLog(Log.ERROR, TAG, e.getMessage());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.test_activity:
            Intent newIntent = new Intent(this, TestActivity.class);
            startActivity(newIntent);
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
}
