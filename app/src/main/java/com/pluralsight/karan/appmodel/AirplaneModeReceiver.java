package com.pluralsight.karan.appmodel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by ADMIN on 7/19/2016.
 */
public class AirplaneModeReceiver extends BroadcastReceiver {

    private String mLabel = null;

    public void setmLabel(String mLabel) {
        this.mLabel = mLabel;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean state = intent.getBooleanExtra("state", false);

        Log.d("appmodel", String.format("Airplane mode changed, Label=%s State=%b", mLabel, state));
    }
}
