package com.example.shani.qarifinder;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shani.qarifinder.Adapters.ViewPageAdapter;

public class ProfileActivity extends AppCompatActivity {

    TextView tvLogo;
    Toolbar toolbar;
    ImageView image_cross;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        toolbar = (Toolbar) findViewById(R.id.include_toolbar_profile);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        image_cross = (ImageView) findViewById(R.id.corss_btn);
        tvLogo = (TextView) findViewById(R.id.toolbar_text_profile);
        String text = "<font color=#FEFEFE>Qari</font> <font color=#F7CE00><b>Finder</b></font>";
        tvLogo.setText(Html.fromHtml(text));
        image_cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });


        tabLayout.addTab(tabLayout.newTab().setText("Students"));
        tabLayout.addTab(tabLayout.newTab().setText("Experience"));


        final ViewPageAdapter adapter = new ViewPageAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}
