package com.example.salonservice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RegActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    BottomNavigationView loginNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        loginNavigationView = findViewById(R.id.loginNavigationView);
        loginNavigationView.setOnNavigationItemSelectedListener(RegActivity.this);

        loginNavigationView.setSelectedItemId(R.id.login);
    }

    LoginFragment login = new LoginFragment();
    Sign_upFragment signup = new Sign_upFragment();



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {



        switch (item.getItemId()) {
            case R.id.login:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, login).commit();
                return true ;

            case R.id.signup:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, signup).commit();
                return true;

        }


        return false;
    }
}
