package com.example.suneet.portfolio;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.StartSmartAnimation;

import org.w3c.dom.Text;

public class MainActivity extends Activity implements View.OnClickListener{

 TextView v;
 TextView about;
    TextView skillset;
    TextView ping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StartSmartAnimation.startAnimation(findViewById(R.id.image), AnimationType.SlideInUp,3000,0,true);
        StartSmartAnimation.startAnimation(findViewById(R.id.socialmedia),AnimationType.Wave,3000,0,true);

        about=(TextView)findViewById(R.id.aboutme);
        skillset=(TextView)findViewById(R.id.skillset);
        ping=(TextView)findViewById(R.id.pingme);
        about.setOnClickListener(this);

        skillset.setOnClickListener(this);

        ping.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        v=(TextView)findViewById(R.id.textView);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"Roboto.ttf");
        v.setTypeface(typeface);

        if(view.getId()==R.id.aboutme)
        {
                v.setText(R.string.about_me);
        }
        if(view.getId()==R.id.skillset)
        {
            v.setText(R.string.skill_set);
        }
        if(view.getId()==R.id.pingme)
        {
            v.setText(R.string.ping_me);
        }
    }
}
