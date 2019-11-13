package com.example.w2a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;

public class AisleActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aisle1);

        AppCompatImageButton AppCompatImageButton2 = (AppCompatImageButton) findViewById(R.id.AppCompatImageButton2);
        AppCompatImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Cart2Intent = new Intent(AisleActivity1.this, CartActivity.class);
                startActivity(Cart2Intent);
            }
        });
    }
}
