package com.project.wordtopdf.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import wordtopdf.R;

public class SplashActivity extends AppCompatActivity {

    TextView texttodo;
    LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        texttodo=findViewById(R.id.texttodo);
        lottie=findViewById(R.id.lottie);

        lottie.playAnimation();

        lottie.animate().translationY(1300).setDuration(1000).setStartDelay(2000);
        texttodo.animate().translationY(-1500).setDuration(1000).setStartDelay(2000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                    finish();
            }
        }, 3000);

    }
}