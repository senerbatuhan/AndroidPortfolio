package com.example.batuhansener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hakkimda(View view) {
        Intent intent = new Intent(getApplicationContext(),Hakkimda.class);
        startActivity(intent);
    }

    public void iletisim(View view) {
        Intent intent = new Intent(getApplicationContext(),IletisimActivity.class);
        startActivity(intent);
    }

    public void sosyal(View view) {
        Intent intent = new Intent(getApplicationContext(),SosyalActivity.class);
        startActivity(intent);
    }

    public void cv(View view) {
        Intent intent = new Intent(getApplicationContext(),CvActivity.class);
        startActivity(intent);
    }
}