package com.enesb.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Context
        // Activity Context -> this kullanilabilir

        // App Context -> getApplicationContext()


        Toast.makeText(MainActivity.this, "Toast Message", Toast.LENGTH_LONG).show(); // Popup mesaj gösterecek
    }

    public void save(View view) {

        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("Save"); // Alertin basligi
        alert.setMessage("Are you sure?"); // Alertin icerigi
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override // Kullanici yes butonuna tiklarsa ne olacagini yaziyoruz
            public void onClick(DialogInterface dialog, int which) {
                // save
                Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_LONG).show();
            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Not Saved", Toast.LENGTH_LONG).show();
            }
        });
        alert.show();


    }
}