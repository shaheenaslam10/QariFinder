package com.example.shani.qarifinder;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLogo = (TextView) findViewById(R.id.qariFinder);

        String text = "<font color=#FEFEFE>Qari</font> <font color=#F7CE00><b>Finder</b></font>";
        tvLogo.setText(Html.fromHtml(text));

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }

        }, 5000);
    }
}
