package com.example.w2a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        Button buttonBuyVisa = (Button) findViewById(R.id.buttonBuyVisa);
        Button buttonBuyMobileMoney = (Button) findViewById(R.id.buttonBuyMobileMoney);

        buttonBuyVisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent VisaIntent = new Intent(PaymentActivity.this, EndActivity.class);
                startActivity(VisaIntent);
            }
        });

        buttonBuyMobileMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MobileIntent = new Intent(PaymentActivity.this, EndActivity.class);
                startActivity(MobileIntent);
            }
        });
    }
}
