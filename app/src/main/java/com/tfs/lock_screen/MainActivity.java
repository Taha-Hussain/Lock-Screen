package com.tfs.lock_screen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ShowLoveImages_click(View view)
    {
        Intent intent = new Intent(this,LoveActivity.class);
        startActivity(intent);
    }
}
