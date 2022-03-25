package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.script.ScriptEngine;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    float num1;
    float num2;
    int ope = 0; //0-suma 1-resta 2-multiplicacio 2-divisio
    float res;
    String text ="";
    boolean n = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = 0;
        num2 = 0;
        textView = findViewById(R.id.textView);
        n = true;
    }

    private void setDisplay(String t){
        text = text + t;
        textView.setText(text);
    }

    private void setNum1(){
        if (n){
            num1 = Float.parseFloat(text);
            text = "";
            setDisplay("");
            n = false;
        }
        else{
            num1 = 0;
        }
    }

    public void btt1Click(android.view.View v) {
        setDisplay("1");
    }

    public void btt2Click(android.view.View v) {
        setDisplay("2");
    }

    public void btt3Click(android.view.View v) {
        setDisplay("3");
    }

    public void btt4Click(android.view.View v) {
        setDisplay("4");
    }

    public void btt5Click(android.view.View v) {
        setDisplay("5");
    }

    public void btt6Click(android.view.View v) {
        setDisplay("6");
    }

    public void btt7Click(android.view.View v) {
        setDisplay("7");
    }

    public void btt8Click(android.view.View v) {
        setDisplay("8");
    }

    public void btt9Click(android.view.View v) {
        setDisplay("9");
    }

    public void btt0Click(android.view.View v) {
        setDisplay("0");
    }

    public void bttsumClick(android.view.View v) {
        setNum1();
        ope = 0;
    }

    public void bttresClick(android.view.View v) {
        setNum1();
        ope=1;
    }

    public void bttmulClick(android.view.View v) {
        setNum1();
        ope=2;
    }

    public void bttdivClick(android.view.View v) {
        setNum1();
        ope = 3;
    }

    public void bttdotClick(android.view.View v) { setDisplay("."); }

    public void bttdelClick(android.view.View v) {
        text="";
        setDisplay("");
    }

    public void bttequClick(View v) {
        num2 = Float.parseFloat(text);
        text = "";
        setDisplay("");
        switch (ope)
        {
            case 0:  res = num1 + num2;
                break;
            case 1:  res = num1 - num2;
                break;
            case 2:  res = num1 * num2;
                break;
            case 3:  res = num1 / num2;
                break;
            default:
                break;
        }
        setDisplay(Float.toString(res));
        n = true;
    }
}