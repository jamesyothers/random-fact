package com.integrityinovations.randomfact;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class randomFactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_fact);

        // declare our view variables and assign them the views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = FactBook.getFact();
                int color = ColorWheel.getColor();
                // update the label with our dynamic fact
                factLabel.setText(fact);
                relativeLayout.setBackgroundColor(ColorWheel.getColor());
            }
        };
        showFactButton.setOnClickListener(listener);

    }
}
