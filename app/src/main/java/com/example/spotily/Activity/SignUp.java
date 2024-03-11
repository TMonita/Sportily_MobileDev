package com.example.spotily.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.spotily.R;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void onClickSubmit (View view){
        TextView txtFullName = findViewById(R.id.txtFullName);
        TextView txtPhoneNumber = findViewById(R.id.txtPhone);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtGender = findViewById(R.id.txtGender);
        TextView txtPassword = findViewById(R.id.txtPassword);
        TextView txtConfirmPassword = findViewById(R.id.txtConfirmPassword);

    }



}