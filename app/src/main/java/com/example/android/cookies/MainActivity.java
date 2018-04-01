package com.example.android.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        TextView eatTextView = (TextView)findViewById(R.id.before_cookie_text_view);
        eatTextView.setText("I'm so full");
        // TODO: Find a reference to the TextView in the layout. Change the text.
        ImageView imageSet = findViewById(R.id.before_cookie_image_view);
        imageSet.setImageResource(R.drawable.after_cookie);
    }
     }
