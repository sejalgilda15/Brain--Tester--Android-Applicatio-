package com.example.braintester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView Add; Button sub;
    EditText Ans;  int a,b;
    Random rand;

    public  void Start(View view) {
        Add =(TextView) findViewById(R.id.Multiply);
        Ans =(EditText) findViewById(R.id.Ans);
        sub =(Button) findViewById(R.id.button2);
        rand =new Random();

           a=rand.nextInt(Difficulty.getDifficultyLevel());
           b=rand.nextInt(Difficulty.getDifficultyLevel()) ;

        Add.setText(a+" "+Difficulty.getOperator()+ " "+b);
        Ans.setVisibility(View.VISIBLE);
        sub.setVisibility(View.INVISIBLE);

    }
    public void submit(View view) {
        try {
            int t = 0;
            switch(Difficulty.getOperator()){
                case "+":
                    t = a + b;
                    break;
                case "-":
                    t = a - b;
                    break;
                case "*":
                    t = a * b;
                    break;
                case "/":
                    t = a / b;
                    break;
            }
            String c = Integer.toString(t);
            if (Ans.getText().toString().equals(c)) {
                Toast.makeText(this, "Right", Toast.LENGTH_SHORT).show();
                Ans.setText("");
                a = rand.nextInt(Difficulty.getDifficultyLevel());
                b = rand.nextInt(Difficulty.getDifficultyLevel());
                Add.setText(a + " " +Difficulty.getOperator() + " " + b);
            } else
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void GoBackToMain(View view) {
        Intent intent1 =new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }
}
