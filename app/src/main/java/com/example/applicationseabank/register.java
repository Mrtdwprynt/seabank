package com.example.applicationseabank;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register extends AppCompatActivity implements View.OnClickListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        button=(Button)findViewById(R.id.daftarButton);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        Intent ExplicitIntent=new Intent(register.this, verifikasi.class);
        startActivity(ExplicitIntent);
    }
}