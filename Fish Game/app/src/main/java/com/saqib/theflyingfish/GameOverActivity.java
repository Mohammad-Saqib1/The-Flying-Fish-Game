package com.saqib.theflyingfish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    private Button startGameAgain;
    private TextView DisplayScore;
    private String ReceivedScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        ReceivedScore=getIntent().getExtras().get("Score").toString();

        startGameAgain=findViewById(R.id.game_over_btn);
        DisplayScore=findViewById(R.id.displayScore);

        startGameAgain.setOnClickListener(view -> {
            Intent intent=new Intent(GameOverActivity.this,MainActivity.class);
            startActivity(intent);
        });

        DisplayScore.setText("Your Score "+ReceivedScore);
    }
}