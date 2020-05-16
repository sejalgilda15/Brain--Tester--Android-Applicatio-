package com.example.braintester;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.ConstraintTableLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity {

    Button button;
    Switch aSwitch;

    public void easy(View view) {
         button= (Button) findViewById(R.id.button8);
         button.setVisibility(View.INVISIBLE);
       Difficulty.setDifficultyLevel(50);
    }

    public void  media(View view) {
        Difficulty.setDifficultyLevel(200);
        button= (Button) findViewById(R.id.button10);
        button.setVisibility(View.INVISIBLE);
    }

    public void hard(View view) {
        Difficulty.setDifficultyLevel(500);
        button= (Button) findViewById(R.id.button9);
        button.setVisibility(View.INVISIBLE);
    }





    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);



    }
}
