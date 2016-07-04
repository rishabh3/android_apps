package com.dutt.rishabh.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Rishabh on 16-06-2016.
 */
public class Arena extends Activity {
    public static EditText name;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_science);
        name = (EditText) findViewById(R.id.txtName);
        b1 = (Button) findViewById(R.id.p2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(Arena.this, Game.class);
                startActivity(t);

                Toast toast = Toast.makeText(getApplicationContext(), name.getText() + " let's get started!", Toast.LENGTH_SHORT);
                    toast.show();

                }
            });

    }
}


