package com.example.spanishcolors;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SayColor(View view){
        Button btnClicked = (Button) view;

        MediaPlayer player = MediaPlayer.create(this, getResources().getIdentifier(btnClicked.getTag().toString(),
                "raw", getPackageName()));

        player.start();
    }
}