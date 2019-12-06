package com.example.helloworld;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView2)).setTextColor(
                        getResources().getColor(R.color.colorChange));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(
                getResources().getColor(R.color.colorPrimaryDark));
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grab the text the user inputs
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if(TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView2)).setText("Hello from Ross!");
                } else{
                    ((TextView) findViewById(R.id.textView2)).setText(newText);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView2)).setTextColor(
                        getResources().getColor(R.color.colorAccent));

                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorPrimary));

                ((TextView) findViewById(R.id.textView2)).setText("Hello from Ross!");
            }
        });



    }
}
