package com.example.tuckingfypos.activities_and_intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button mButton;
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Intent intent = new Intent(MainActivity.this, ResultActivity.class);

/*
Intent should take in editText fields using getStringExtra(), concatenate them to the larger puzzle string,
 and return them to ResultActivity.java.
 */
}
