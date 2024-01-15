package com.example.applicationseabank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.login_app);
        btn2 = (Button)findViewById(R.id.CYAButton);
        button.setOnClickListener(this);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bbtn();
            }
        });
    }

    @Override
    public void onClick(View arg0) {
        Intent ExplicitIntent=new Intent(MainActivity.this, login.class);
        startActivity(ExplicitIntent);
    }
    public void bbtn(){
        Intent emp = new Intent(MainActivity.this, register.class);
        startActivity(emp);
    }

}


