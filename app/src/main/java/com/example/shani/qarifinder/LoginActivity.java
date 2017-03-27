package com.example.shani.qarifinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.TestMethod;
import android.text.Html;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView tvLogo,tv_createAcount,tv_forgotPass;
    EditText ed_email,ed_password;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvLogo = (TextView) findViewById(R.id.qariFinder);
        ed_email = (EditText) findViewById(R.id.editText_email);
        ed_password = (EditText) findViewById(R.id.editText_password);
        btn_login = (Button)findViewById(R.id.btn_login);
        tv_createAcount = (TextView)findViewById(R.id.textView_createAcount);
        tv_forgotPass = (TextView)findViewById(R.id.textView_forgotPass);
        String text = "<font color=#FEFEFE>Qari</font> <font color=#F7CE00><b>Finder</b></font>";
        tvLogo.setText(Html.fromHtml(text));

        ed_password.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int DRAWABLE_LEFT = 0;
                final int DRAWABLE_TOP = 1;
                final int DRAWABLE_RIGHT = 2;
                final int DRAWABLE_BOTTOM = 3;

                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(event.getRawX() >= (ed_password.getRight() - ed_password.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                        // your action here
                        ed_password.setInputType(InputType.TYPE_CLASS_TEXT);
                        return true;
                    }
                }
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    if(event.getRawX() >= (ed_password.getRight() - ed_password.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                        // your action here
                        ed_password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        return true;
                    }
                }
                return false;
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,MapActivity.class);
                startActivity(intent);
            }
        });
        tv_createAcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Create account",Toast.LENGTH_SHORT).show();
            }
        });
        tv_forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Forgot Password",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
