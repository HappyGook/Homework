package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText psd;
    EditText lgd;
    String password;
    public static String KEY_PASS;
    public static String KEY_LOG;
    String newpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        lgd=findViewById(R.id.login);
        psd=findViewById(R.id.pass);
        password = getString(R.string.Password);
        newpass=getIntent().getStringExtra(KEY_PASS);
        lgd.setText(getIntent().getStringExtra(KEY_LOG));
        if(newpass!=null) password=newpass;
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent passed=new Intent(MainActivity.this,PassedActivity.class);
                Intent reg=new Intent(MainActivity.this,RegistrationActivity.class);
                if(psd.getText().toString().equals(password)) startActivity(passed);
                else startActivity(reg);


            }
        });
    }

}