package org.srujan.stepoutv3;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    FloatingActionButton fb,google;
    float v=0;

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout= findViewById(R.id.tablayout);
        viewPager= findViewById(R.id.viewpager);
        fb= findViewById(R.id.fb);
        google= findViewById(R.id.google);



        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.addTab(tabLayout.newTab().setText("SignUp"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final LoginAdapter adapter = new LoginAdapter(getSupportFragmentManager(),  this,tabLayout.getTabCount());

        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        fb.setTranslationY(300);
        google.setTranslationY(300);
        tabLayout.setTranslationY(300);

        fb.setAlpha(v);
        google.setAlpha(v);
        tabLayout.setAlpha(v);

        fb.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        tabLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),Home.class);
                startActivity(intent);
            }
        });



    }



}

