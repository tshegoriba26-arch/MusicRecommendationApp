package com.example.musicrecommendationapp;

import android.os.Bundle;
import android.view.Buttton;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Buttton submitButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup);
        submitButton = findViewById(R.id.submitBtn);
        resultTextView = findViewById(R.id.resultTextView);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this, " Please select a genre", Toast.LENGTH_SHORT).show();
                } else {
                    RadioButton selectedRadioButton = findViewById(selectedId);
                    string genre = selectedRadioButton.getText().tostring();
                }

            }
        });

    }

    private void recommendPlaylist(String genre) {
        switch (genre) {
            case "Pop":
                resultTextView.setText("Recommended playlist for Pop fans:\n1. Taylor Swift\n2. Ed Sheeran\n3. Ariana Grande");

            case "Rock":
                resultTextView.setText("Recommended playlist for Rock fans:\n1. Queen\n2. Bon Jovi\n3. The Beatles");
                break;
            // Add cases for other genres as needed
            default:
                resultTextView.setText("Sorry, we don have recommendations for that genre");
        }

    }
}