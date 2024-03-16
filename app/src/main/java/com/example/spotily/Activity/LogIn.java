package com.example.spotily.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.spotily.R;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void onClickSubmit (View view){
        TextView txtFullName = findViewById(R.id.txtFullName_ad);
        TextView txtPhoneNumber = findViewById(R.id.Id_ad);
        TextView txtEmail = findViewById(R.id.Phone_ad);
        TextView txtPassword = findViewById(R.id.Password_ad);

    }

}