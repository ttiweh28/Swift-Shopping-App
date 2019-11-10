package com.example.w2a;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        Button buttonLogin = (Button) findViewById(R.id.buttonLogin);
        TextView textViewNotRegistered = (TextView) findViewById(R.id.textViewNotRegistered);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(LoginActivity.this, Appactivity2.class);
                startActivity(LoginIntent);
            }
        });

        textViewNotRegistered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backRegisterIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(backRegisterIntent);
            }
        });


    }
}
