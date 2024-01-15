package com.example.applicationseabank;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity implements View.OnClickListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button=(Button)findViewById(R.id.loginButton);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        Intent ExplicitIntent=new Intent(login.this, verifikasi.class);
        startActivity(ExplicitIntent);
    }
}