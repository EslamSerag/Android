package com.eslam.android.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText email, password, passAgain, mobNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.pass);
        passAgain = (EditText) findViewById(R.id.again);
        mobNumber = (EditText) findViewById(R.id.mob);

        TextView Continue = (TextView) findViewById(R.id.cont);
        Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emailVal = email.getText().toString();
                String passwordVal = password.getText().toString();
                String passAgainVal = passAgain.getText().toString();
                String mobNumVal = mobNumber.getText().toString();

                Intent intent = new Intent(MainActivity.this, Information.class);

                intent.putExtra("email", "Email: " + emailVal);
                intent.putExtra("password", "Password: " + passwordVal);
                intent.putExtra("again", "Again: " + passAgainVal);
                intent.putExtra("mobile", "Mobile: " + mobNumVal);

                startActivity(intent);
            }
        });


    }
}
