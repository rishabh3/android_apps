package com.dutt.rishabh.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by Rishabh on 17-06-2016.
 */
public class Game1 extends Activity {
    TextView tp;
    RadioGroup rg1;
    RadioButton r1,r2,r3;
    Button next;
    String ques[]={"1)What is 1 Byte in bit?","2)How many keywords are there in java?","3)The first Mechanical Computer designed by Charles Babbage is called:","4)C is:","5)Odd one out:","6)What is primary requirement of computer programmer?","7)A device that converts digital to analog signal?","8)India's first super computer is:","9)Which is an operating system?","10)What is number of bit patterns provided by 7-bit code?"};
    String anst[]={"8","50","Analytical Engine","A third generation High level language","POP","Logical Mind","Modem","Param","All","256"};
    String op[]={"2","4","8","45","50","32","Analytical Engine","Abacus","Calculator","A third generation High level language","Assembly Language","Machine Language","FTP","TCP","POP","Logical Mind","Mathematical Mind","Scientific knowledge","Telephone","Mic","Modem","Agni","Param","Trishul","Android","Solaris","All","256","64","128"};
    int flag1=0;
    public static int score,right,wrong;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_game1);
        tp=(TextView)findViewById(R.id.tv1);
        rg1=(RadioGroup)findViewById(R.id.rg1);
        r1=(RadioButton)findViewById(R.id.s1);
        r2=(RadioButton)findViewById(R.id.s2);
        r3=(RadioButton)findViewById(R.id.s3);
        next=(Button)findViewById(R.id.e1);
        tp.setText(ques[flag1]);
        r1.setText(op[flag1*3]);
        r2.setText(op[flag1*3+1]);
        r3.setText(op[flag1*3+2]);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton urans=(RadioButton)findViewById(rg1.getCheckedRadioButtonId());
                String ans=urans.getText().toString();
                if(ans.equalsIgnoreCase(anst[flag1])){
                    right++;
                }
                else{
                   wrong++;
                }
                flag1++;
                if(flag1<ques.length){
                    tp.setText(ques[flag1]);
                    r1.setText(op[flag1*3]);
                    r2.setText(op[flag1*3+1]);
                    r3.setText(op[flag1*3+2]);
                } else{
                    score=right*4-wrong;
                    Intent intent=new Intent(Game1.this,Result1.class);
                    startActivity(intent);
                }


            }
        });
    }
}
