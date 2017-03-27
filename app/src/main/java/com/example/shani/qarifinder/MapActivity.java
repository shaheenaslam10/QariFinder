package com.example.shani.qarifinder;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MapActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    TextView tvLogo;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        toolbar = (Toolbar)findViewById(R.id.include_toolbar);
        setSupportActionBar(toolbar);

        tvLogo = (TextView) findViewById(R.id.toolbar_text);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        navigationView = (NavigationView)findViewById(R.id.navigationView);

        String text = "<font color=#FEFEFE>Qari</font> <font color=#F7CE00><b>Finder</b></font>";
        tvLogo.setText(Html.fromHtml(text));

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home1:
                        Toast.makeText(getApplication(),"Home",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.home2:
                        Toast.makeText(getApplication(),"Home",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.home3:
                        Toast.makeText(getApplication(),"Home",Toast.LENGTH_SHORT).show();
                        break;
                }
                    return false;
            }
        });

    }


    public class MapAsync extends AsyncTask<String , String , String>{

        @Override
        protected String doInBackground(String... strings) {

            OkHttpClient okHttpClient = new OkHttpClient();
            Request request = new Request.Builder().url("").build();
// hohohoho

            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
        }
    }





    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int item_id = item.getItemId();
        if(item_id==R.id.menu_messagaIcon){
            Intent intent = new Intent(MapActivity.this,ProfileActivity.class);
            startActivity(intent);
        }


        return true;
    }
}

