package com.eldarus.vpn;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView statusText;
    private Button connectButton;
    private boolean connected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);
        layout.setBackgroundColor(Color.rgb(10, 18, 35));

        TextView title = new TextView(this);
        title.setText("EL DARUS VPN");
        title.setTextSize(30);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        statusText = new TextView(this);
        statusText.setText("DISCONNECTED");
        statusText.setTextSize(18);
        statusText.setTextColor(Color.YELLOW);
        statusText.setGravity(Gravity.CENTER);

        connectButton = new Button(this);
        connectButton.setText("CONNECT");

        TextView serverText = new TextView(this);
        serverText.setText("Server: Cameroon");
        serverText.setTextSize(18);
        serverText.setTextColor(Color.WHITE);
        serverText.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(statusText);
        layout.addView(connectButton);
        layout.addView(serverText);

        setContentView(layout);

        connectButton.setOnClickListener(v -> {
            connected = !connected;

            if (connected) {
                statusText.setText("CONNECTING...");
                connectButton.setText("DISCONNECT");
            } else {
                statusText.setText("DISCONNECTED");
                connectButton.setText("CONNECT");
            }
        });
    }
                          }
