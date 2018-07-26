package com.example.aniket.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice= (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice= (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArray = {R.drawable.d1 ,
                R.drawable.d2,
                R.drawable.d3,
                R.drawable.d4,
                R.drawable.d5,
                R.drawable.d6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);

                leftDice.setImageResource(diceArray[number]);

                number = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);

            }
        });

    }
}
