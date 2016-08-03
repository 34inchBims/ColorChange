package com.example.mcleod.colorchange;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class Blue extends AppCompatActivity {

public int b = 0;
    public void changeColor (View view)
    {  View somevariable = findViewById(R.id.laidout);
        somevariable.setBackgroundColor(getResources().getColor(R.color.blue));
        b= 1;
    }
    public void changeColor1 (View view)
    {  View somevariable = findViewById(R.id.laidout);
        somevariable.setBackgroundColor(getResources().getColor(R.color.red));
        b=2;
    }
    public void changeColor2 (View view)
    {  View somevariable = findViewById(R.id.laidout);
        somevariable.setBackgroundColor(getResources().getColor(R.color.green));
        b=3;
    }
    public void changeColor3 (View view)
    {  View somevariable = findViewById(R.id.laidout);
        somevariable.setBackgroundColor(getResources().getColor(R.color.yellow));
        b=4;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(savedInstanceState != null){
                  }

           }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_blue, menu);
        return true;
    }
    @Override
    public void onSaveInstanceState(Bundle outState){
        outState.putInt("background", b);
        super.onSaveInstanceState(outState);



    }
    @Override
    protected void onDestroy() {
        super.onDestroy();


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
