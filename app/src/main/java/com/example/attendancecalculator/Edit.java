package com.example.attendancecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Edit extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,e24,e25,e26,e27,e28,e29,e30;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_edit);
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        e5=(EditText)findViewById(R.id.editText5);
        e6=(EditText)findViewById(R.id.editText6);
        e7=(EditText)findViewById(R.id.editText7);
        e8=(EditText)findViewById(R.id.editText8);
        e9=(EditText)findViewById(R.id.editText9);
        e10=(EditText)findViewById(R.id.editText10);
        e11=(EditText)findViewById(R.id.editText11);
        e12=(EditText)findViewById(R.id.editText12);
        e13=(EditText)findViewById(R.id.editText13);
        e14=(EditText)findViewById(R.id.editText14);
        e15=(EditText)findViewById(R.id.editText15);
        e16=(EditText)findViewById(R.id.editText16);
        e17=(EditText)findViewById(R.id.editText17);
        e18=(EditText)findViewById(R.id.editText18);
        e19=(EditText)findViewById(R.id.editText37);
        e20=(EditText)findViewById(R.id.editText38);
        e21=(EditText)findViewById(R.id.editText39);
        e22=(EditText)findViewById(R.id.editText40);
        e23=(EditText)findViewById(R.id.editText41);
        e24=(EditText)findViewById(R.id.editText42);
        e25=(EditText)findViewById(R.id.editText49);
        e26=(EditText)findViewById(R.id.editText50);
        e27=(EditText)findViewById(R.id.editText51);
        e28=(EditText)findViewById(R.id.editText52);
        e29=(EditText)findViewById(R.id.editText53);
        e30=(EditText)findViewById(R.id.editText54);
        save = (Button)findViewById(R.id.button2);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });
    }
    void save()
    {
        FileOutputStream fos =null;
        try {
            fos = openFileOutput("Monday", 0);
            fos.write((e1.getText().toString() + "\n").getBytes());
            fos.write((e2.getText().toString() + "\n").getBytes());
            fos.write((e3.getText().toString() + "\n").getBytes());
            fos.write((e4.getText().toString() + "\n").getBytes());
            fos.write((e5.getText().toString() + "\n").getBytes());
            fos.write((e6.getText().toString() + "\n").getBytes());
            fos = openFileOutput("Tuesday", 0);
            fos.write((e7.getText().toString() + "\n").getBytes());
            fos.write((e8.getText().toString() + "\n").getBytes());
            fos.write((e9.getText().toString() + "\n").getBytes());
            fos.write((e10.getText().toString() + "\n").getBytes());
            fos.write((e11.getText().toString() + "\n").getBytes());
            fos.write((e12.getText().toString() + "\n").getBytes());
            fos = openFileOutput("Wednesday", 0);
            fos.write((e13.getText().toString() + "\n").getBytes());
            fos.write((e14.getText().toString() + "\n").getBytes());
            fos.write((e15.getText().toString() + "\n").getBytes());
            fos.write((e16.getText().toString() + "\n").getBytes());
            fos.write((e17.getText().toString() + "\n").getBytes());
            fos.write((e18.getText().toString() + "\n").getBytes());
            fos = openFileOutput("Thursday", 0);
            fos.write((e19.getText().toString() + "\n").getBytes());
            fos.write((e20.getText().toString() + "\n").getBytes());
            fos.write((e21.getText().toString() + "\n").getBytes());
            fos.write((e22.getText().toString() + "\n").getBytes());
            fos.write((e23.getText().toString() + "\n").getBytes());
            fos.write((e24.getText().toString() + "\n").getBytes());
            fos = openFileOutput("Friday", 0);
            fos.write((e25.getText().toString() + "\n").getBytes());
            fos.write((e26.getText().toString() + "\n").getBytes());
            fos.write((e27.getText().toString() + "\n").getBytes());
            fos.write((e28.getText().toString() + "\n").getBytes());
            fos.write((e29.getText().toString() + "\n").getBytes());
            fos.write((e30.getText().toString() + "\n").getBytes());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
