package com.example.customlistviewadapterexam;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.gnirt69.customlistviewadapterexam.R;

public class contact_detail extends Activity {

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;

    private String getname;
    private String getphone;
    private String getfirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);

        textView1=(TextView)findViewById(R.id.Name);
        textView2=(TextView)findViewById(R.id.Phone);
        textView3=(TextView)findViewById(R.id.shape);

        Bundle b =getIntent().getExtras();
        getname = b.getString("Name");
        getphone = b.getString("Number");
        getfirst = b.getString("nickname");

        textView1.setText(getname);
        textView2.setText(getphone);
        textView3.setText(getfirst);

        if(getfirst.charAt(0)=='A'){
            textView3.setBackgroundResource(R.drawable.shape);
        }
        else if(getfirst.charAt(0)=='B'){
            textView3.setBackgroundResource(R.drawable.shape2);
        }
        else if(getfirst.charAt(0)=='C'){
            textView3.setBackgroundResource(R.drawable.shape3);
        }
        else if(getfirst.charAt(0)=='D'){
            textView3.setBackgroundResource(R.drawable.shape4);
        }
        else if(getfirst.charAt(0)=='E'){
            textView3.setBackgroundResource(R.drawable.shape5);
        }
        else if(getfirst.charAt(0)=='F'){
            textView3.setBackgroundResource(R.drawable.shape6);
        }
        else if(getfirst.charAt(0)=='G'){
            textView3.setBackgroundResource(R.drawable.shape7);
        }
        else if(getfirst.charAt(0)=='H'){
            textView3.setBackgroundResource(R.drawable.shape8);
        }
        else if(getfirst.charAt(0)=='I'){
            textView3.setBackgroundResource(R.drawable.shape9);
        }
        else if(getfirst.charAt(0)=='J'){
            textView3.setBackgroundResource(R.drawable.shape10);
        }
        else if(getfirst.charAt(0)=='K'){
            textView3.setBackgroundResource(R.drawable.shape11);
        }
        else if(getfirst.charAt(0)=='L'){
            textView3.setBackgroundResource(R.drawable.shape12);
        }
        else if(getfirst.charAt(0)=='M'){
            textView3.setBackgroundResource(R.drawable.shape13);
        }
        else if(getfirst.charAt(0)=='N'){
            textView3.setBackgroundResource(R.drawable.shape14);
        }
        else if(getfirst.charAt(0)=='O'){
            textView3.setBackgroundResource(R.drawable.shape15);
        }
        else if(getfirst.charAt(0)=='P'){
            textView3.setBackgroundResource(R.drawable.shape16);
        }
        else if(getfirst.charAt(0)=='Q'){
            textView3.setBackgroundResource(R.drawable.shape17);
        }
        else if(getfirst.charAt(0)=='R'){
            textView3.setBackgroundResource(R.drawable.shape18);
        }
        else if(getfirst.charAt(0)=='S'){
            textView3.setBackgroundResource(R.drawable.shape19);
        }
        else if(getfirst.charAt(0)=='T'){
            textView3.setBackgroundResource(R.drawable.shape20);
        }
        else if(getfirst.charAt(0)=='U'){
            textView3.setBackgroundResource(R.drawable.shape21);
        }
        else if(getfirst.charAt(0)=='V'){
            textView3.setBackgroundResource(R.drawable.shape22);
        }
        else if(getfirst.charAt(0)=='W'){
            textView3.setBackgroundResource(R.drawable.shape23);
        }
        else if(getfirst.charAt(0)=='X'){
            textView3.setBackgroundResource(R.drawable.shape24);
        }
        else if(getfirst.charAt(0)=='Y'){
            textView3.setBackgroundResource(R.drawable.shape25);
        }
        else if(getfirst.charAt(0)=='Z'){
            textView3.setBackgroundResource(R.drawable.shape26);
        }
    }
}
