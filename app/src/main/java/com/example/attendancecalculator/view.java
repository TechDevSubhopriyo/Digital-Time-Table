package com.example.attendancecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class view extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_view);
        tv1=(TextView)findViewById(R.id.textView11);
        tv2=(TextView)findViewById(R.id.textView12);
        tv3=(TextView)findViewById(R.id.textView13);
        tv4=(TextView)findViewById(R.id.textView14);
        tv5=(TextView)findViewById(R.id.textView15);
        String v="";
        try {
            FileInputStream fis =null;
            fis = openFileInput("Monday");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String s = "";
            while ((s = br.readLine()) != null) {
                if(s.length()==0)
                v = v+"\t\t\t\t\t\t\t" ;
                else v=v+"\t\t"+s;
            }
            tv1.setText(v);
            fis = openFileInput("Tuesday");
            br = new BufferedReader(new InputStreamReader(fis));
            v = s = "";
            while ((s = br.readLine()) != null) {
                if(s.length()==0)
                    v = v+"\t\t\t\t\t\t\t" ;
                else v=v+"\t\t"+s;
            }
            tv2.setText(v);
            fis = openFileInput("Wednesday");
            br = new BufferedReader(new InputStreamReader(fis));
            v = s = "";
            while ((s = br.readLine()) != null) {
                if(s.length()==0)
                    v = v+"\t\t\t\t\t\t\t" ;
                else v=v+"\t\t"+s;
            }
            tv3.setText(v);
            fis =openFileInput("Thursday");
            br = new BufferedReader(new InputStreamReader(fis));
            v = s = "";
            while ((s = br.readLine()) != null) {
                if(s.length()==0)
                    v = v+"\t\t\t\t\t\t\t" ;
                else v=v+"\t\t"+s;
            }
            tv4.setText(v);
            fis = openFileInput("Friday");
            br = new BufferedReader(new InputStreamReader(fis));
            v = s = "";
            while ((s = br.readLine()) != null) {
                if(s.length()==0)
                    v = v+"\t\t\t\t\t\t\t" ;
                else v=v+"\t\t"+s;
            }
            tv5.setText(v);
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
