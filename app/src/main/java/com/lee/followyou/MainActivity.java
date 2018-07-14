package com.lee.followyou;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btn_start_fellow_me);

    }

    public void startFellowMe(View view){
        ComponentName cn = new ComponentName("com.lee.fellowme","com.lee.fellowme.MainActivity");
        Intent intent = new Intent();
        intent.setComponent(cn);
        intent.setAction("android.intent.action.MAIN");
        startActivity(intent);
    }
}
