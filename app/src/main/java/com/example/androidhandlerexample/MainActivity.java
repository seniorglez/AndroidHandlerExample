package com.example.androidhandlerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textViewA);
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        ProgressBar progressBar=findViewById(R.id.progressBar);
        progressBar.setMax(Integer.parseInt(((EditText)findViewById(R.id.editText)).getText().toString()));
        HandlerImplementation handlerImplementation = new HandlerImplementation(progressBar,textView);
        ThreadImplementation threadImplementation = new ThreadImplementation(handlerImplementation,((EditText)findViewById(R.id.editText)));
        threadImplementation.start();
    }
}
