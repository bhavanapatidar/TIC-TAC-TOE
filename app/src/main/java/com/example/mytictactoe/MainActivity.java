package com.example.mytictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    // 0 - X
    // 1 - O
    int activePlayer = 0;
    int[] gameState = {2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 };
    //   State meanings

    //0 - X
    //1 - O
    //2 - Null
    int [] [] winPositions = {{0,1,2},{3,4,5},{6,7,8},{0,4,8},{2,4,6},{0,3,6},{1,4,7},{2,5,8}};

    public void playerTap(View view){
        ImageView img = (ImageView) view;
        int tappedImage = Integer.parseInt(img.getTag() .toString());
        if (gameState[tappedImage] == 2) {
          gameState[tappedImage] = activePlayer;
          img.setTranslationY(-1000f);
            if (activePlayer == 0) {
                img.setImageResource(R.drawable.x);
                activePlayer = 1;
            }
            else{
                img.setImageResource(R.drawable.o);
                activePlayer = 0;
            }
        }

        img.animate().translationYBy(1000f).setDuration(300);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}