package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv1 = findViewById(R.id.textView1);
        final Button btn1 = findViewById(R.id.button1);
        final EditText txt1 = findViewById(R.id.editText1);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv1.setText(txt1.getText().toString());
            }
        });
    }
}
