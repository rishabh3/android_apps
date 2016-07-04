package com.dutt.rishabh.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Rishabh on 16-06-2016.
 */
public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_rules);
    }
    public void onHitBack(View x){
        if(x.getId()==R.id.p1){
            Intent inte = new Intent(this,MainActivity.class);
            startActivity(inte);
        }
    }
}
