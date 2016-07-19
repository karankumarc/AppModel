package com.pluralsight.karan.appmodel;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;import com.pluralsight.karan.appmodel.AirplaneModeReceiver;import com.pluralsight.karan.appmodel.R;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Button buttonAirplane = (Button) findViewById(R.id.buttonAirplaneModeMonitor);
        buttonAirplane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AirplaneModeReceiver receiver = new AirplaneModeReceiver();
                receiver.setmLabel("Activity");

                IntentFilter intentFilter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
                OtherActivity.this.registerReceiver(receiver,intentFilter);

                Log.d("appmodel", "Registered to monitor airplane mode");
            }
        });
    }
}
