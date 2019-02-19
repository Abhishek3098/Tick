package com.example.abhi.tick;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    SharedPreferences sharedpreferences;
    TextView first_name, last_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        first_name = (TextView) findViewById(R.id.user_first_name);
        last_name = (TextView) findViewById(R.id.user_last_name);

        sharedpreferences = getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        first_name.setText(sharedpreferences.getString("FirstName", ""));
        last_name.setText(sharedpreferences.getString("LastName", ""));

    }
}
