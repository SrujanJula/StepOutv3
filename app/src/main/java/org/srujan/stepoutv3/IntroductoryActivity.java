package org.srujan.stepoutv3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.airbnb.lottie.LottieAnimationView;

public class IntroductoryActivity extends AppCompatActivity {

    ImageView logowel, welcome;
    TextView textwel;
    LottieAnimationView lottieAnimationView;

    private static final int NUM_pages = 2;
    private ViewPager viewpager;
    private ScreenSlidePagerAdapter pagerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);

        logowel =findViewById(R.id.logowel);
        welcome = findViewById(R.id.welcome);
        textwel = findViewById(R.id.textwel);
        lottieAnimationView = findViewById(R.id.earth);

        viewpager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(pagerAdapter);

        welcome.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        logowel.animate().translationY(-1400).setDuration(1000).setStartDelay(4000);
        textwel.animate().translationY(-1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(-1400).setDuration(1000).setStartDelay(4000);


    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
           switch (position){

               case 0:
                Onboarding1 tab1 = new Onboarding1();
                return tab1;

               case 1:
                   Onboarding2 tab2 = new Onboarding2();
                   return tab2;

           }
           return null;

        }

        @Override
        public int getCount() {
            return NUM_pages;

        }
    }


}