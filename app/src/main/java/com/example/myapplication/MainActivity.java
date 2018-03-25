package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public float a=0;
    public float b=0;
    public float result;
    int temp;
    char operator;
    boolean c=true;

   //
  void add_number(View view,TextView T_text)
  {
      if(c==true)
      {
          String d=(String) T_text.getText();
          a = Float.parseFloat(d);
          Log.i("info",Float.toString(a));
      }
      else
      {
          String d=(String) T_text.getText();
          b = Float.parseFloat(d);
          Log.i("info",Float.toString(b));
      }
  }
    public void clickOne(View view)
    {
        TextView T_text=(TextView) findViewById(R.id.temp);
        T_text.setText(T_text.getText()+"1");
    }
    public void clicktwo(View view)
    {
        TextView T_text=(TextView) findViewById(R.id.temp);
        T_text.setText(T_text.getText()+"2");
    }
    public void clickthree(View view) {
        TextView T_text=(TextView) findViewById(R.id.temp);
        T_text.setText(T_text.getText()+"3");
    }
    public void clickfour(View view)  {
        TextView T_text=(TextView) findViewById(R.id.temp);
        T_text.setText(T_text.getText()+"4");
    }
    public void clickfive(View view)  {
        TextView T_text=(TextView) findViewById(R.id.temp);
        T_text.setText(T_text.getText()+"5");
    }
    public void clicksix(View view)  {
        TextView T_text=(TextView) findViewById(R.id.temp);
        T_text.setText(T_text.getText()+"6");
    }
    public void clickseven(View view)  {
        TextView T_text=(TextView) findViewById(R.id.temp);
        T_text.setText(T_text.getText()+"7");
    }
    public void clickeight(View view)  {
        TextView T_text=(TextView) findViewById(R.id.temp);
        T_text.setText(T_text.getText()+"8");
    }
    public void clicknine(View view)  {
        TextView T_text=(TextView) findViewById(R.id.temp);
        T_text.setText(T_text.getText()+"9");
    }
    public void clickzero(View view) {
        TextView T_text=(TextView) findViewById(R.id.temp);
        T_text.setText(T_text.getText()+"0");
    }
    public void clickpoint(View view) {
        TextView T_text=(TextView) findViewById(R.id.temp);
        T_text.setText(T_text.getText()+".");
    }
    public void clickminus(View view) {
        TextView T_text=(TextView) findViewById(R.id.temp);
        TextView F_text=(TextView) findViewById(R.id.fina);
        operator='-';
        add_number(view,T_text);
        F_text.setText(F_text.getText()+T_text.getText().toString()+"-");
        T_text.setText(null);
        c=false;
    }
    public void clickplus(View view) {
        TextView T_text=(TextView) findViewById(R.id.temp);
        TextView F_text=(TextView) findViewById(R.id.fina);
        operator='+';
        add_number(view,T_text);
        F_text.setText(F_text.getText()+T_text.getText().toString()+"+");
        T_text.setText(null);
        c=false;
    }
    public void clickdiv(View view) {
        TextView T_text=(TextView) findViewById(R.id.temp);
        TextView F_text=(TextView) findViewById(R.id.fina);
        operator='/';
        add_number(view,T_text);
        F_text.setText(F_text.getText()+T_text.getText().toString()+"/");
        T_text.setText(null);
        c=false;
    }
    public void clickmul(View view) {
        TextView T_text=(TextView) findViewById(R.id.temp);
        TextView F_text=(TextView) findViewById(R.id.fina);
        operator='*';
        add_number(view,T_text);
        F_text.setText(F_text.getText()+T_text.getText().toString()+"*");
        T_text.setText(null);
        c=false;
    }
    public void clickequal(View view) {
        TextView T_text=(TextView) findViewById(R.id.temp);
        TextView F_text=(TextView) findViewById(R.id.fina);
        add_number(view,T_text);
        if(operator=='+')
            result=a+b;
        else  if(operator=='-')
            result=a-b;
        else if(operator=='*')
            result=a*b;
        else if(operator=='/')
            result=a/b;
        Log.i("info",Float.toString(result));
        String g=Float.toString(result);
        F_text.setText(F_text.getText()+T_text.getText().toString()+"="+Float.toString(result));
        T_text.setText(null);
        c=true;
    }
    public void clickclear(View view) {
        TextView T_text=(TextView) findViewById(R.id.temp);
        TextView F_text=(TextView) findViewById(R.id.fina);
        if(T_text.getText().length()>1)
        {
            CharSequence currentText = T_text.getText();
            T_text.setText(currentText.subSequence(0, currentText.length()-1));

        }
        else if(T_text.getText().length()==1) {
            T_text.setText(null);
        }
        else
        {
            F_text.setText(null);
            a=0;
            b=0;
            result=0;
            c=true;
        }
    }
}
