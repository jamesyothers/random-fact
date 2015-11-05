package com.integrityinovations.randomfact;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.util.Random;

public class randomFactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_fact);

        // declare our view variables and assign them the views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // the button was clicked, so update the fact label with a new fact
                String fact;
                // randomly select a fact
                // construct a new random number generator
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(3);
                fact = randomNumber + "";
                // update the label with our dynamic fact
                factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);


    }
}
