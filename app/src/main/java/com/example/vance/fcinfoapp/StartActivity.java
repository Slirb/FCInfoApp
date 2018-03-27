//FCInfo App
//Vance Curtis
//November 5, 2015
//This app provides some basic info on the 2nd generation Mazda RX-7
package com.example.vance.fcinfoapp;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void generalClick(View view){
        Intent i =new Intent(this,GeneralActivity.class);

        startActivity(i);
    }

    public void specificsClick(View view){

        Intent i =new Intent(this,SpecificationsActivity.class);

        startActivity(i);
    }

    public void webClick(View view){


        Intent i =new Intent(this,WebActivity.class);

        String myString="http://www.rx7club.com/2nd-generation-specific-1986-1992-17/";
        i.putExtra("url",myString);
        startActivity(i);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
