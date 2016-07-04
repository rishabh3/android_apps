package com.dutt.rishabh.quiz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by Rishabh on 17-06-2016.
 */
public class Game extends Activity {
    TextView t;

    RadioGroup rg;
    RadioButton rb1,rb2,rb3;
    Button btn;
    String question[]={"1)Who invented Telegraph? ","2)Which of the following is a FIRE AND FORGET anti tank missile?","3)The apparatus used for detecting lie is known as:","4) A device used for measuring the depth of the sea is called -","5)What is measured by the sling Psychrometer?","6)Vermiculture technology is used in:","7)The first printed works are called -","8)Hydroponics is","9)Which of the following belongs to the branch of Geology?","10)'White Revolution' is related to:"};
    String ansText[]={"Samuel Morse","Nag","Polygraph","Fathometer","Humidity","Organic Farming","Incunabula","Plant growth in liquid culture medium","Palaeontology","Milk Production"};
    String opt[]={"Samuel Morse","Alexander Graham Bell","Marcony"," Trishul","Akash","Nag","Polygraph","Gyroscope","Kymograph","Altimeter","Hydrometer","Fathometer","Temperature","Pressure","Humidity","Production of Fish","Organic Farming","Poultry Farming","Incunabula","Impensis","Imprimatur","Soil conservation","Plant growth under laboratory conditions","Plant growth in liquid culture medium","Meteorology","Cosmology","Palaeontology","Milk Production","Fish Production","Wheat Production"};
    int flag=0;
    public static int marks,correct,incorrect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_game);
        t=(TextView) findViewById(R.id.tv);
        rg=(RadioGroup)findViewById(R.id.rg);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);
        btn=(Button)findViewById(R.id.m1);
        t.setText(question[flag]);
        rb1.setText(opt[flag*3]);
        rb2.setText(opt[flag*3+1]);
        rb3.setText(opt[flag*3+2]);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton ans=(RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String urans=ans.getText().toString();
                if(urans.equalsIgnoreCase(ansText[flag])){
                    correct++;
                }
                else{
                    incorrect++;
                }
                flag++;
                if(flag<question.length){
                    t.setText(question[flag]);
                    rb1.setText(opt[flag*3]);
                    rb2.setText(opt[flag*3+1]);
                    rb3.setText(opt[flag*3+2]);

                }
                else{
                    marks=correct*4-incorrect;
                    Intent i=new Intent(Game.this,Result.class);
                    startActivity(i);
                }
            }
        });

    }





}
