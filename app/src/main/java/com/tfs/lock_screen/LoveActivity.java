package com.tfs.lock_screen;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.app.WallpaperManager;
import android.widget.Toast;



import java.io.IOException;

/**
 * Created by Taha on 06/04/2016.
 */
public class LoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);
    }

    public void SetAsWallPaper_click(View view)
    {
        WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());

        int ID = view.getId();
        if(ID == R.id.love1) // your R file will have all your id's in the literal form.
        {

            try {
                // Change the current system wallpaper
                myWallpaperManager.setResource(+ R.drawable.newlove);
                // Show a toast message on successful change
                Toast.makeText(LoveActivity.this,
                        "Wallpaper successfully changed", Toast.LENGTH_SHORT)
                        .show();

            } catch (IOException e) {
                // TODO Auto-generated catch block
            }
        }

        if(ID == R.id.love2) // your R file will have all your id's in the literal form.
        {

            try {
                // Change the current system wallpaper
                myWallpaperManager.setResource(+ R.drawable.love2);
                // Show a toast message on successful change
                Toast.makeText(LoveActivity.this,
                        "Wallpaper successfully changed", Toast.LENGTH_SHORT)
                        .show();

            } catch (IOException e) {
                // TODO Auto-generated catch block
            }
        }

        if(ID == R.id.love3) // your R file will have all your id's in the literal form.
        {

            try {
                // Change the current system wallpaper
                myWallpaperManager.setResource(+ R.drawable.love3);
                // Show a toast message on successful change
                Toast.makeText(LoveActivity.this,
                        "Wallpaper successfully changed", Toast.LENGTH_SHORT)
                        .show();

            } catch (IOException e) {
                // TODO Auto-generated catch block
            }
        }

        if(ID == R.id.love4) // your R file will have all your id's in the literal form.
        {

            try {
                // Change the current system wallpaper
                myWallpaperManager.setResource(+ R.drawable.love4);
                // Show a toast message on successful change
                Toast.makeText(LoveActivity.this,
                        "Wallpaper successfully changed", Toast.LENGTH_SHORT)
                        .show();

            } catch (IOException e) {
                // TODO Auto-generated catch block
            }
        }

        if(ID == R.id.love5) // your R file will have all your id's in the literal form.
        {

            try {
                // Change the current system wallpaper
                myWallpaperManager.setResource(+ R.drawable.love5);
                // Show a toast message on successful change
                Toast.makeText(LoveActivity.this,
                        "Wallpaper successfully changed", Toast.LENGTH_SHORT)
                        .show();

            } catch (IOException e) {
                // TODO Auto-generated catch block
            }
        }
    }
}
