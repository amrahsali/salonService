package com.example.salonservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void To_register(View view) {
        Intent intent = new Intent(WelcomeActivity.this, RegActivity.class);
        startActivity(intent);
    }
}