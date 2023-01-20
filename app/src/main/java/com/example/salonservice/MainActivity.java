package com.example.salonservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    RecyclerViewAdapter adapter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void To_beauty(View view) {
        Intent intent = new Intent(MainActivity.this, Beauty_shopActivity.class);
        startActivity(intent);
    }


    public void To_barber(View view) {
        Intent intent = new Intent(MainActivity.this, Barber_shopActivity.class);
        startActivity(intent);

    }
}