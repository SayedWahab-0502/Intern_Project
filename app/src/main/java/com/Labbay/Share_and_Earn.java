package com.Labbay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Share_and_Earn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_and__earn);

        Button button = (Button)findViewById(R.id.send_request);
        startActivity(new Intent(getApplicationContext(), Send_request.class));
    }
}
