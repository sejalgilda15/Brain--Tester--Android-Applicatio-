package com.example.braintester;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.text.style.BackgroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static SQLiteDatabase sqLiteDatabase;
    static  Cursor c;
    Intent intent;
    public void addition(View view) {
        Difficulty.setOperator("+");
        intent=new Intent(getApplicationContext(),BeforeStartActivity.class);
        startActivity(intent);
    }
    public void substraction(View view) {
        intent=new Intent(getApplicationContext(),BeforeStartActivity.class);
        Difficulty.setOperator("-");
        startActivity(intent);
    }

    public void multiplication(View view) {
        Difficulty.setOperator("*");
        intent=new Intent(getApplicationContext(),BeforeStartActivity.class);
        startActivity(intent);
    }
       public void division(View view) {
           Difficulty.setOperator("/");
        intent=new Intent(getApplicationContext(),BeforeStartActivity.class);
        startActivity(intent);
    }


    public void aptitude(View view) {
        intent=new Intent(getApplicationContext(),AptituteActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            sqLiteDatabase = this.openOrCreateDatabase("INFORMATION", MODE_PRIVATE, null);
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS queans(Questions VARCHAR,Number INT(10))");
            sqLiteDatabase.execSQL("INSERT INTO queans (questions,number) VALUES('Twsdfd',1)");
            sqLiteDatabase.execSQL("INSERT INTO queans (questions,number) VALUES('Thwwwww',2)");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Menu
    @Override
    public boolean onCreateOptionsMenu(Menu men) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.add_features,men);
        return super.onCreateOptionsMenu(men);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       Intent intent=new Intent(getApplicationContext(),SettingsActivity.class);
       startActivity(intent);
       return super.onOptionsItemSelected(item);
    }


}
