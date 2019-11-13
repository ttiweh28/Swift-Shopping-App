package com.example.w2a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AisleActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aisle3);

        AppCompatImageButton AppCompatImageButton4 = (AppCompatImageButton) findViewById(R.id.AppCompatImageButton4);
        AppCompatImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Cart4Intent = new Intent(AisleActivity3.this, CartActivity.class);
                startActivity(Cart4Intent);
            }
        });
    }
}
