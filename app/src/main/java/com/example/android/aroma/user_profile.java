package com.example.android.aroma;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class user_profile extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
        Bundle extras = getIntent().getExtras();

        System.out.println(extras.getSerializable("Liked_recipes"));
        System.out.println(extras.getString("Email"));
        System.out.println(extras.getString("Username"));
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
