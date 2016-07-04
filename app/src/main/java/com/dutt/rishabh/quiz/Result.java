package com.dutt.rishabh.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/**
 * Created by Rishabh on 18-06-2016.
 */
public class Result extends Activity {
    TextView o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_result);
        o=(TextView)findViewById(R.id.tv1);
        StringBuffer sb=new StringBuffer();
        sb.append( ""+Arena.name.getText().toString()+" has got "+Game.correct+" correct answers and "+Game.incorrect+" incorrect answers.\n\n");
        sb.append("Hence "+Arena.name.getText().toString()+" scores "+Game.marks+"\n\n");
        sb.append("Thanks for playing the quiz.Hit Replay to play again or hit quit to quit.");
        o.setText(sb);
    }
    public void onHitReplay(View v){
        if(v.getId()==R.id.x1){
            Intent j= new Intent(this,SecondActivity.class);
            startActivity(j);
            Game.correct=0;
            Game.incorrect=0;
            Game.marks=0;

        }
    }
    public void onHitQuit(View x){
        if(x.getId()==R.id.x2){
            Intent k= new Intent(this,MainActivity.class);
            startActivity(k);
            Game.correct=0;
            Game.incorrect=0;
            Game.marks=0;

        }
    }
}
