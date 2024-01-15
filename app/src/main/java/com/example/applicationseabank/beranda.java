package com.example.applicationseabank;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class beranda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationview);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.menuHome) {
                    Toast.makeText(getApplicationContext(), "Menu Home dipilih", Toast.LENGTH_LONG).show();
                    // Tambahkan kode untuk menangani klik pada menu Home
                    return true;

                } else if (itemId == R.id.bayar) {
                    Toast.makeText(getApplicationContext(), "Menu Bayar dipilih", Toast.LENGTH_LONG).show();
                    Intent intentBayar = new Intent(beranda.this, transfer.class);
                    startActivity(intentBayar);
                    return true;

                } else if (itemId == R.id.qris) {
                    Toast.makeText(getApplicationContext(), "Menu QRIS dipilih", Toast.LENGTH_LONG).show();
                    Intent intentQris = new Intent(beranda.this, qris.class);
                    startActivity(intentQris);
                    return true;

                } else if (itemId == R.id.menudeposit) {
                    Toast.makeText(getApplicationContext(), "Menu Deposit dipilih", Toast.LENGTH_LONG).show();
                    Intent intentDeposit = new Intent(beranda.this, deposit.class);
                    startActivity(intentDeposit);
                    return true;

                } else if (itemId == R.id.menuSaya) {
                    Toast.makeText(getApplicationContext(), "Menu Saya dipilih", Toast.LENGTH_LONG).show();
                    Intent intentSaya = new Intent(beranda.this, saya.class);
                    startActivity(intentSaya);
                    return true;
                }

                return false;
            }
        });
    }


    private void startActivity(AppCompatActivity originActivity, Class<?> destinationClass) {
        Toast.makeText(beranda.this, "Menu dipilih", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(originActivity, destinationClass);
        startActivity(intent);
        finish();
    }
}
