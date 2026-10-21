package com.example.leeseunghee;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView largeImage;

    private final int[] thumbnailIds = {
            R.id.imageButton1, R.id.imageButton2, R.id.imageButton3,
            R.id.imageButton4, R.id.imageButton5, R.id.imageButton6
    };

    private final int[] imageIds = {
            R.drawable.imgbtn1, R.drawable.imgbtn2, R.drawable.imgbtn3,
            R.drawable.imgbtn4, R.drawable.imgbtn5, R.drawable.imgbtn6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        largeImage = findViewById(R.id.largeImage);
        largeImage.setImageResource(imageIds[0]);

        for (int index = 0; index < thumbnailIds.length; index++) {
            ImageButton thumbnail = findViewById(thumbnailIds[index]);
            int imageId = imageIds[index];
            thumbnail.setOnClickListener(view -> {
                largeImage.setImageResource(imageId);
            });
        }
    }
}
