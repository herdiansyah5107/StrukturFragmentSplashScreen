package com.example.indonesiastruktur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_WORKOUT_ID = "id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        JawaBaratDetailFragment frag1 = (JawaBaratDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int jawabaratId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        frag1.setJawaBarat(jawabaratId);

        JawaTengahDetailFragment frag2 = (JawaTengahDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int jawatengahId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        frag2.setJawaTengah(jawatengahId);

        JawaTimurDetailFragment frag3 = (JawaTimurDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int jawatimurId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        frag3.setJawaTimur(jawatimurId);
    }
}
