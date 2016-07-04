package com.dutt.rishabh.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Rishabh on 16-06-2016.
 */
public class Arena1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_computer_science);
            }
    public static EditText name1;
    public void onHitBegin(View w){
        if(w.getId()==R.id.p3){
            Intent j =new Intent(this,Game1.class);
            startActivity(j);
            name1 = (EditText) findViewById(R.id.txtName1);
            Toast toast = Toast.makeText(getApplicationContext(),name1.getText()+" let's get started!",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
