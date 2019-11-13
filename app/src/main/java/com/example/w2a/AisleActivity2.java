package com.example.w2a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AisleActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aisle2);

        AppCompatImageButton AppCompatImageButton3 = (AppCompatImageButton) findViewById(R.id.AppCompatImageButton3);
        AppCompatImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Cart3Intent = new Intent(AisleActivity2.this, CartActivity.class);
                startActivity(Cart3Intent);
            }
        });
    }
}
