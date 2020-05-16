package com.example.braintester;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.MailTo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Random;

public class AptituteActivity extends AppCompatActivity {

    TextView question1;
    RadioButton radioButton;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioGroup radioGroup;
   // String PasswordIndex=c.getColumnIndex("Password");
  static String [] values=new String[7];
 static String j="";
    boolean yesno=false;
    public void start(View view) {

          try {
              question1=(TextView) findViewById(R.id.Qustions);
              radioButton=findViewById(R.id.radioButton);
              radioButton2=findViewById(R.id.radioButton2);
              radioButton3=findViewById(R.id.radioButton3);
              radioButton4=findViewById(R.id.radioButton4);

              radioGroup =findViewById(R.id.radioGroup);
              radioGroup.setVisibility(View.VISIBLE);
                  Files(view);

          }
          catch (Exception e) {
              e.printStackTrace();
          }
    }
    public void Files(View view) {
        InputStream is = getResources().openRawResource(R.raw.aptitute);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
        String line = "";

        Random random1 = new Random();
        try {
            int t = random1.nextInt(15);
            while (t != 0) {
                reader.readLine();
                t--;
            }
            line = reader.readLine();
            reader.close();
            values = line.split(";");

            question1.setText(values[0]);
            radioButton.setText(values[1]);
            radioButton2.setText(values[2]);
            radioButton3.setText(values[3]);
            radioButton4.setText(values[4]);
            Log.i("tag",values[5]);
            j=values[5];


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public void NextQuestion(View view){
        try {
            int radioId = radioGroup.getCheckedRadioButtonId();
            RadioButton r = findViewById(radioId);
            String i = r.getText().toString();
            yesno=i==values[5];
            if (yesno) {
                Toast.makeText(this, "Right", Toast.LENGTH_SHORT).show();
                r.setChecked(false);
                yesno=false;
                Files(view);
            } else {

                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitute);
    }
}
