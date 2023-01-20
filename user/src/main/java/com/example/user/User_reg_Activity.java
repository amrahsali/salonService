package com.example.user;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class User_reg_Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView loginNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reg);

        loginNavigationView = findViewById(R.id.loginNavigationView);
        loginNavigationView.setOnNavigationItemSelectedListener(User_reg_Activity.this);

        loginNavigationView.setSelectedItemId(R.id.login);
    }

    LoginFragment login = new LoginFragment();
    SighUpFragment signup = new SighUpFragment();



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.login:
                getSupportFragmentManager().beginTransaction().replace(R.id.user_container, login).commit();
                return true ;

            case R.id.signup:
                getSupportFragmentManager().beginTransaction().replace(R.id.user_container, signup).commit();
                return true;

        }


        return false;

    }
}