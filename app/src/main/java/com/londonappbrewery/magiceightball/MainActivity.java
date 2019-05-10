package com.londonappbrewery.magiceightball;

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


    final int[] ball_array = {R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5,
    };

    final ImageView ball_display = (ImageView) findViewById(R.id.image_eight_ball);

    Button ask_button = (Button) findViewById(R.id.ask_button);

    ask_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Random rand_generator = new Random();
            int number;

            number = rand_generator.nextInt(5);

            ball_display.setImageResource(ball_array[number]);

        }
    });
    }
}


