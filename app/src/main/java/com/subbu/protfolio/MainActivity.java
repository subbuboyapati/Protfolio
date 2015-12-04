package com.subbu.protfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button spotify;
    private Button scores;
    private Button library;
    private Button bigger;
    private Button reader;
    private Button capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spotify = (Button) findViewById(R.id.spotify);
        scores = (Button) findViewById(R.id.scores);
        library = (Button) findViewById(R.id.library);
        bigger = (Button) findViewById(R.id.bigger);
        reader = (Button) findViewById(R.id.reader);
        capstone = (Button) findViewById(R.id.capstone);
        spotify.setOnClickListener(this);
        scores.setOnClickListener(this);
        library.setOnClickListener(this);
        bigger.setOnClickListener(this);
        reader.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String message = "";
        switch (v.getId()) {
            case R.id.spotify:
                message = "Spotify";
                break;
            case R.id.scores:
                message = "Scores";
                break;
            case R.id.library:
                message = "Library";
                break;
            case R.id.bigger:
                message = "Build it bigger";
                break;
            case R.id.reader:
                message = "XYZ Reader";
                break;
            case R.id.capstone:
                message = "Capstone:My Own App";
                break;
        }
        Toast.makeText(this, "This button will launch " + message + " app!", Toast.LENGTH_SHORT).show();
    }
}
