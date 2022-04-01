package com.example.menutest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        ll = (LinearLayout) findViewById(R.id.bg);
        switch (item.getItemId()){
            case R.id.itemgreen:
                ll.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemblue:
                ll.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.itemblack:
                ll.setBackgroundColor(Color.BLACK);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}