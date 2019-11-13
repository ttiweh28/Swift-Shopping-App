package com.example.w2a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Button buttonCheckOut = (Button) findViewById(R.id.buttonCheckOut);
        Button buttonBack = (Button) findViewById(R.id.buttonBack);


        buttonCheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent PaymentIntent = new Intent(CartActivity.this, PaymentActivity.class);
                startActivity(PaymentIntent);
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent CartBackIntent = new Intent(CartActivity.this, SupermarketHomeActivity.class);
                startActivity(CartBackIntent);
            }
        });
    }
}
