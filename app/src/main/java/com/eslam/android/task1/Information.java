package com.eslam.android.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Information extends AppCompatActivity {

    private TextView emailValue, passwordValue, againValue, mobNumValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Intent theValue = this.getIntent();

        emailValue = (TextView) findViewById(R.id.email_val);
        emailValue.setText(theValue.getExtras().getString("email"));

        passwordValue = (TextView) findViewById(R.id.password_val);
        passwordValue.setText(theValue.getExtras().getString("password"));

        againValue = (TextView) findViewById(R.id.again_val);
        againValue.setText(theValue.getExtras().getString("again"));

        mobNumValue = (TextView) findViewById(R.id.tel_val);
        mobNumValue.setText(theValue.getExtras().getString("mobile"));


    }
}
