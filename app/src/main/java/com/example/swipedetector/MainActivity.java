package com.example.swipedetector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Swipe layout code, not good enough for this
//            SwipeInterface swipeInterface = new SwipeInterface() {
//                @Override
//                public void bottom2top() {}
//                @Override
//                public void left2right() {}
//                @Override
//                public void right2left(View v) {
//                }
//                @Override
//                public void top2bottom() {}
//            };
//            ActivitySwipeDetector swipe = new ActivitySwipeDetector(swipeInterface);
//            LinearLayout swipe_layout = (LinearLayout) findViewById(R.id.RoutineButtonAddsHere);
//            swipe_layout.setOnTouchListener(swipe);
    }
}