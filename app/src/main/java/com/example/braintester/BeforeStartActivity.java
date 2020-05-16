package com.example.braintester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BeforeStartActivity extends AppCompatActivity {
    Intent intent2;

    String t1="No. of Questions : "+Integer.toString(Difficulty.getNoOfQuestions())+"\n"+"Difficulty Level : "+Difficulty.getDifficultyLevel();

    //Difficulty q=new Difficulty();
    public void beforeStart(View view){
        intent2=new Intent(getApplicationContext(),SecondActivity.class);
        try {
            wait(10000);
        }catch (Exception e){
            e.printStackTrace();
            
        }
        TextView textView4= (TextView) findViewById(R.id.TextOfBefore);
        textView4.setText(t1);
        startActivity(intent2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_start);


    }
}
