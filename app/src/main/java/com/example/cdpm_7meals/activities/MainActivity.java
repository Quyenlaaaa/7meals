package com.example.cdpm_7meals.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.example.cdpm_7meals.R;


public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME = 5000;


    Animation topAnima, bottomAnima;
    ImageView logo, brand;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // full screen at intro
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        AppCenter.start(getApplication(), "d0a31364-fb38-4cf2-9f51-ca3ec3a27fe1", Analytics.class, Crashes.class);
        // load animation
        topAnima = AnimationUtils.loadAnimation(this, R.anim.top_icon_animation);
        bottomAnima = AnimationUtils.loadAnimation(this, R.anim.bot_logan_animation);

        // set animation
        logo = findViewById(R.id.img_icon_intro);
        brand = findViewById(R.id.img_slogan_intro);
        logo.setAnimation(topAnima);
        brand.setAnimation(bottomAnima);

        // next to intro2
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, AppActivity.class));
                finish();
            }
        }, SPLASH_SCREEN_TIME);

    }
}