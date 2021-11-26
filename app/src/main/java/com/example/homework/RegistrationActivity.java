package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {
    Button but;
    EditText login;
    EditText pasreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        but=findViewById(R.id.button);
        pasreg=findViewById(R.id.pasreg);
        login=findViewById(R.id.logreg);


        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegistrationActivity.this,MainActivity.class);
                String passd=pasreg.getText().toString();
                String loggd=login.getText().toString();
                intent.putExtra(MainActivity.KEY_PASS, passd);
                intent.putExtra(MainActivity.KEY_LOG,loggd);

                startActivity(intent);

            }
        });
    }
}