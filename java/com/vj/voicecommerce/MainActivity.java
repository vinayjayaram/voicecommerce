package com.vj.voicecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText phoneNumber,emailId,passWord;
     Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNumber = (EditText) findViewById(R.id.phoneNumber);
        emailId = (EditText) findViewById(R.id.emailId);
        passWord = (EditText) findViewById(R.id.passWord);
        loginBtn = findViewById(R.id.submitButton);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                //Invoke REST API module here, You can use https://square.github.io/retrofit/ to make API calls

                String phone = String.valueOf(phoneNumber.getText());
                String pass = String.valueOf(passWord.getText());

                Log.d("LoginPassword",""+phone+"---"+pass);

                Intent intent = new Intent(MainActivity.this,ChatActivity.class);
                startActivity(intent);


            }
        });
    }

  }
