package com.example.w2a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        EditText editTextFirstName = (EditText) findViewById(R.id.editTextFirstName);
        EditText editTextLastName = (EditText) findViewById(R.id.editTextLastName);
        EditText editTextPhone = (EditText) findViewById(R.id.editTextPhone);
        EditText editTextEmail0 = (EditText) findViewById(R.id.editTextEmail0);
        EditText editTextPassword0 = (EditText) findViewById(R.id.editTextPassword0);
        EditText editTextConfirmPassword = (EditText) findViewById(R.id.editTextConfirmPassword);
        EditText editTextGender = (EditText) findViewById(R.id.editTextGender);
        EditText editTextDOB = (EditText) findViewById(R.id.editTextDOB);
        Button RegisterButton = (Button) findViewById(R.id.RegisterButton);
        TextView textViewAlreadyRegistered = (TextView)findViewById(R.id.textViewAlreadyRegistered);

        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegLoginIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(RegLoginIntent);
            }
        });

        textViewAlreadyRegistered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegLoginIntent1 = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(RegLoginIntent1);

            }
        });

    }
}
