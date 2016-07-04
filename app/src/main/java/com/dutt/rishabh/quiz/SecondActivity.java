package com.dutt.rishabh.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Rishabh on 16-06-2016.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_arena);
    }
    public void onHitScience(View p){
        if(p.getId()==R.id.m1){
            Intent intent = new Intent(this,Arena.class);
            startActivity(intent);
        }
    }
    public void onHitComputerScience(View w){
        if(w.getId()==R.id.bt2){
            Intent intent1 = new Intent(this,Arena1.class);
            startActivity(intent1);
        }
    }
    public void onHitGoBack(View w){
        if(w.getId()==R.id.bt3){
            Intent intent2 = new Intent(this,MainActivity.class);
            startActivity(intent2);
        }
    }
}
