package com.example.w2a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Appactivity2 extends  Activity{

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content2_main);

        Button buttonGoToSuperMarket = (Button) findViewById(R.id.buttonGoToSuperMarket);

        buttonGoToSuperMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent SuperMarketIntent = new Intent(Appactivity2.this, SupermarketHomeActivity.class);
            }
        });
    }

}

