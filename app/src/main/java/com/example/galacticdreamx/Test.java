package com.example.galacticdreamx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends AppCompatActivity implements View.OnClickListener {

    RadioGroup ques1, ques2;
    RadioButton bmale, bfemale,b2634, b3440, b40plus;
    Button btnresul;
    TextView resultado;
    int b1=21,b2=22,rta=20,respar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        ques1= (RadioGroup) findViewById(R.id.q1);
        ques2 =(RadioGroup) findViewById(R.id.q2);
        bmale = (RadioButton) findViewById(R.id.btnmale);
        bfemale = (RadioButton) findViewById(R.id.btnfemale);
        b2634= (RadioButton) findViewById(R.id.btn3040);
        b3440 = (RadioButton) findViewById(R.id.btn4050);
        b40plus = (RadioButton) findViewById(R.id.btn60plus);
        btnresul = (Button) findViewById(R.id.showresult);

        resultado= (TextView) findViewById(R.id.res);


        bmale.setOnClickListener(this);
        bfemale.setOnClickListener(this);
        b2634.setOnClickListener(this);
        b3440.setOnClickListener(this);
        b40plus.setOnClickListener(this);

    }

    public void onRadioButtonClicked(View v) {
        Toast.makeText(getApplicationContext(), "Ya estás dentro!",Toast.LENGTH_SHORT).show();
        // Is the button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        // Check which radio button was clicked
        switch(v.getId()) {
            case R.id.btnmale:
                if (checked)
                    Toast.makeText(getApplicationContext(), "You're male",Toast.LENGTH_SHORT).show();
                    break;
            case R.id.btnfemale:
                if (checked)
                    Toast.makeText(getApplicationContext(),"You're female",Toast.LENGTH_SHORT).show();
                    break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnmale:
                b1=1;
                break;
            case R.id.btnfemale:
                b1=2;
                break;
            case R.id.btn3040:
                b2=1;
                break;
            case R.id.btn4050:
                b2=2;
                break;
            case R.id.btn60plus:
                b2=3;
                break;
            case R.id.showresult:
                rta=b1+b2;
        }
        resultado.setText(""+rta);
    }

}