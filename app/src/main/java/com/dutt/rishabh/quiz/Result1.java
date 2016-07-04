package com.dutt.rishabh.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Rishabh on 18-06-2016.
 */
public class Result1 extends Activity {
    TextView o;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_result1);
        o=(TextView)findViewById(R.id.tv1);
        StringBuffer sb=new StringBuffer();
        sb.append( ""+Arena1.name1.getText().toString()+" has got "+Game1.right+" right answers and "+Game1.wrong+" wrong answers.\n\n");
        sb.append("Hence " + Arena1.name1.getText().toString() + " scores " + Game1.score + "\n\n");
        sb.append("Thanks for playing the quiz.\n\nHit Replay to play again or hit quit to quit.");
        o.setText(sb);
    }
    public void onHit(View x){
        if(x.getId()==R.id.btn1){
            Intent k=new Intent(Result1.this,SecondActivity.class);
            startActivity(k);
            Game1.score=0;
            Game1.wrong=0;
            Game1.right=0;
        }
    }
    public void onHitExit(View x){
        if(x.getId()==R.id.btn2){
            Intent k=new Intent(Result1.this,MainActivity.class);
            startActivity(k);
            Game1.score=0;
            Game1.wrong=0;
            Game1.right=0;
        }
    }
    
}
