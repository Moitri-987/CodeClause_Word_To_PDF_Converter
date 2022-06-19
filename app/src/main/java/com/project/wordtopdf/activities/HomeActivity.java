package com.project.wordtopdf.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import wordtopdf.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {


    CardView cardAbout, cardTextToPDF,
           cardHistory, cardViewFiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);

        setViews();

    }

    private void setViews() {
        cardAbout = findViewById(R.id.cardAbout);
        cardTextToPDF = findViewById(R.id.cardTextToPdf);
        cardHistory = findViewById(R.id.cardHistory);
        cardViewFiles = findViewById(R.id.cardViewFiles);

        cardAbout.setOnClickListener(this);
        cardTextToPDF.setOnClickListener(this);
        cardHistory.setOnClickListener(this);
        cardViewFiles.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cardAbout:
            {
                    Intent intent = new Intent(HomeActivity.this, AboutActivity.class);
                    intent.putExtra("fragment", "about");
                    startActivity(intent);
                }
//
//
                break;
            case R.id.cardTextToPdf:
            {
                    Intent intent2 = new Intent(HomeActivity.this, SecondActivity.class);
                    intent2.putExtra("fragment", "textToPdf");
                    startActivity(intent2);
                }

                break;

            case R.id.cardHistory:
            {
                    Intent intent6 = new Intent(HomeActivity.this, SecondActivity.class);
                    intent6.putExtra("fragment", "history");
                    startActivity(intent6);
                }


                break;
            case R.id.cardViewFiles:
            {
                    Intent intent7 = new Intent(HomeActivity.this, SecondActivity.class);
                    intent7.putExtra("fragment", "view");
                    startActivity(intent7);
                }


                break;
        }

    }
}