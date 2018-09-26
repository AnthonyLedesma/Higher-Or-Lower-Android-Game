package com.app.aledesma.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    int sysNumber;

    public void compareValues(View view) {
        EditText userInput = (EditText) findViewById(R.id.GuessNumberText);
        int userNumber = parseInt(userInput.getText().toString());

        if (sysNumber > userNumber){
            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
        } else if (sysNumber < userNumber) {
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        } else {
            String comparison = String.format("You guessed correct! %d is the system number and your guess was %d", sysNumber, userNumber);
            Toast.makeText(this, comparison, Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rando = new Random();
        sysNumber = rando.nextInt(20) + 1;

    }
}
