package com.darryncampbell.datawedgeintentexample2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final static String DATAWEDGE_ACTION = "com.symbol.datawedge.api.ACTION";
    private final static String DATAWEDGE_EXTRA_KEY_SCANNER_TRIGGER_CONTROL = "com.symbol.datawedge.api.SOFT_SCAN_TRIGGER";
    private final static String DATAWEDGE_EXTRA_VALUE_TOGGLE_SCANNER = "TOGGLE_SCANNING";
    private final static String DATAWEDGE_EXTRA_KEY_SCANNER_CONTROL = "com.symbol.datawedge.api.SCANNER_INPUT_PLUGIN";
    private final static String DATAWEDGE_EXTRA_VALUE_ENABLE_SCANNER = "ENABLE_PLUGIN";
    private final static String DATAWEDGE_EXTRA_VALUE_DISABLE_SCANNER = "DISABLE_PLUGIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnStartSoftScan = (Button) findViewById(R.id.btnToggleScanner);
        btnStartSoftScan.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               Intent intent = new Intent();
               intent.setAction(DATAWEDGE_ACTION);
               intent.putExtra(DATAWEDGE_EXTRA_KEY_SCANNER_TRIGGER_CONTROL, DATAWEDGE_EXTRA_VALUE_TOGGLE_SCANNER);
               sendBroadcast(intent);
           }
        });

        final Button btnEnableScanner = (Button) findViewById(R.id.btnEnableScanner);
        btnEnableScanner.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(DATAWEDGE_ACTION);
                intent.putExtra(DATAWEDGE_EXTRA_KEY_SCANNER_CONTROL, DATAWEDGE_EXTRA_VALUE_ENABLE_SCANNER);
                sendBroadcast(intent);
            }
        });

        final Button btnDisableScanner = (Button) findViewById(R.id.btnDisableScanner);
        btnDisableScanner.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(DATAWEDGE_ACTION);
                intent.putExtra(DATAWEDGE_EXTRA_KEY_SCANNER_CONTROL, DATAWEDGE_EXTRA_VALUE_DISABLE_SCANNER);
                sendBroadcast(intent);
            }
        });
    }

}
