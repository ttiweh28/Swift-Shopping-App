package com.example.w2a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SupermarketHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supermarket_home);

        AppCompatImageButton AppCompatImageButtonAppliance = (AppCompatImageButton) findViewById(R.id.AppCompatImageButtonAppliance);
        AppCompatImageButton AppCompatImageButtonFood = (AppCompatImageButton) findViewById(R.id.AppCompatImageButtonFood);
        AppCompatImageButton AppCompatImageButtonDetergent = (AppCompatImageButton) findViewById(R.id.AppCompatImageButtonDetergent);

        AppCompatImageButtonAppliance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent AisleOneIntent = new Intent(SupermarketHomeActivity.this, AisleActivity1.class);
                startActivity(AisleOneIntent);
            }
        });


        AppCompatImageButtonFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AisleTwoIntent = new Intent(SupermarketHomeActivity.this, AisleActivity2.class);
                startActivity(AisleTwoIntent);

            }
        });

        AppCompatImageButtonDetergent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent AisleThreeIntent = new Intent(SupermarketHomeActivity.this, AisleActivity3.class);
                startActivity(AisleThreeIntent);
            }
        });

        AppCompatImageButton AppCompatImageButton1 = (AppCompatImageButton) findViewById(R.id.AppCompatImageButton1);
        AppCompatImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Cart1Intent = new Intent(SupermarketHomeActivity.this, CartActivity.class);
                startActivity(Cart1Intent);
            }
        });

    }
}
