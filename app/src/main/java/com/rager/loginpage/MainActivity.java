package com.rager.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        ImageView gbtn = (ImageView) findViewById(R.id.gbtn);
        ImageView fbtn = (ImageView) findViewById(R.id.fbtn);
        ImageView tbtn = (ImageView) findViewById(R.id.tbtn);



        //divyansh and divyansh

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("a")&& password.getText().toString().equals("a")){
                    //correct
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(i);
                    // close this activity
                    finish();

                }else
                    //incorrect
                    Toast.makeText(MainActivity.this,"LOGIN FAILED!",Toast.LENGTH_SHORT).show();

            }
        });

        gbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"WILL BE AVAiLABLE SOON!",Toast.LENGTH_SHORT).show();
            }
        });
        fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"WILL BE AVAiLABLE SOON!",Toast.LENGTH_SHORT).show();
            }
        });
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"WILL BE AVAiLABLE SOON!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}