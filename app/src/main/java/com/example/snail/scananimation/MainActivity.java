package com.example.snail.scananimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivCicle1,ivCicle2,ivCicle3,ivCicle4,ivStartEnd;
    private Animation animation1,animation2,animation3,animation4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivCicle1 = findViewById(R.id.iv_circle1);
        ivCicle2 = findViewById(R.id.iv_circle2);
        ivCicle3 = findViewById(R.id.iv_circle3);
        ivCicle4 = findViewById(R.id.iv_circle4);
        ivStartEnd = findViewById(R.id.iv_start_end);

        animation1 = AnimationUtils.loadAnimation(this, R.anim.scale_alpha_anim);
        animation2 = AnimationUtils.loadAnimation(this, R.anim.scale_alpha_anim);
        animation3 = AnimationUtils.loadAnimation(this, R.anim.scale_alpha_anim);
        animation4 = AnimationUtils.loadAnimation(this, R.anim.scale_alpha_anim);
    }

    public void onStartEnd(View view) {
        ivCicle1.startAnimation(animation1);

        animation2.setStartOffset(600);
        ivCicle2.startAnimation(animation2);

        animation3.setStartOffset(1200);
        ivCicle3.startAnimation(animation3);

        animation4.setStartOffset(1800);
        ivCicle4.startAnimation(animation4);
    }
}
