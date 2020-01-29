package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button closeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        closeButton = findViewById(R.id.button);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
             alert.setMessage("Do you want to close this App").setCancelable(false).setPositiveButton("yes", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                     finish();
                 }
             })
                     .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialog, int which) {
                             dialog.cancel();
                         }
                     });
             AlertDialog alertDialog = alert.create();
             alertDialog.setTitle("Alert !!!");
             alertDialog.show();


            }
        });
    }


    }

