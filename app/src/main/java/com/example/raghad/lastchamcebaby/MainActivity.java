package com.example.raghad.lastchamcebaby;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
              LinearLayout button=findViewById(R.id.hotSunButton);
        button.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View view) {
                                          final MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.notificationsound);
                                          mp.start();
                                          showHotSunAlert(MainActivity.this);
                                      }
                                  });
        }
    public void showHotSunAlert (MainActivity view){
        AlertDialog.Builder hotSun=new AlertDialog.Builder(this);
        AlertDialog alertDialog = hotSun.setMessage(R.string.warning_hotSun)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();

                    }
                }).setTitle("WARNING").setIcon(R.drawable.hot).create();
        hotSun.show();
    }
}
