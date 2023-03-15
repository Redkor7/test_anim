package com.example.test_anim;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.imageButton);

        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(this, R.drawable.scale);

        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        button.startAnimation(anim);
                        break;

                    case MotionEvent.ACTION_UP:
                        // start zoom in animation which returns to original state
                        break;
                }
                return false;
            }
        });
    }
}