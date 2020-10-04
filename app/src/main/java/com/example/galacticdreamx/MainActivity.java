package com.example.galacticdreamx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view){
        Intent btn1 = new Intent(this, LogInActivity.class);
        startActivity(btn1);
    }

    public void CreateAccount(View view){
        Intent btn2 = new Intent(this, CreateAccountActivity.class);
        startActivity(btn2);

    }


}