package com.rager.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageView lefticon = findViewById(R.id.user_profile);
        ImageView righticon = findViewById(R.id.home_icon);
        TextView title = findViewById(R.id.toolbar_title);

        lefticon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "You clicked on left icon", Toast.LENGTH_SHORT).show();
            }
        });
        righticon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "You clicked on right icon", Toast.LENGTH_SHORT).show();
            }
        });
    }
}