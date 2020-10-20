package com.example.pwta_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Integer[] counter = {5};
        ((TextView)findViewById(R.id.textview2)).setText(counter[0].toString());
        Button hello_bt = (Button)findViewById(R.id.button);
        Button more_bt = (Button)findViewById(R.id.button2);
        Button less_bt = (Button)findViewById(R.id.button3) ;

        hello_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textview)).setText("Clicked");
            }
        });

        more_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter[0]++;
                ((TextView)findViewById(R.id.textview2)).setText(counter[0].toString());
            }
        });

        less_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter[0]--;
                ((TextView)findViewById(R.id.textview2)).setText(counter[0].toString());
            }
        });
    }
}