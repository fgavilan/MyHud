package com.example.user.myhud;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity{
    private TextView tv;
    private ImageButton snButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textClock);
        Typeface mfont = Typeface.createFromAsset(getAssets(),"Comfortaa-Regular.ttf");
        tv.setTypeface(mfont);
    }
    public void sensorAbre(View view) {
        Intent i = new Intent(this, HardwareActivity.class );
        startActivity(i);
    }

}
