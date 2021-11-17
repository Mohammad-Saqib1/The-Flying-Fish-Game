package com.saqib.theflyingfish;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    Button playBtn,ExitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        playBtn=findViewById(R.id.playBtn);
        ExitBtn=findViewById(R.id.exitBtn);

        playBtn.setOnClickListener(view -> {
            Intent intent=new Intent(SplashActivity.this,MainActivity.class);
            startActivity(intent);
        });

        ExitBtn.setOnClickListener(view -> {

            new AlertDialog.Builder(SplashActivity.this)
                    .setIcon(R.drawable.ic_baseline_warning_24)
                    .setTitle("Exit")
                    .setMessage("Are You Sure You Want to Exit??")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    }).setNeutralButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).show();


        });



    }



}