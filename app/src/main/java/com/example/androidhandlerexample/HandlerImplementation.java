package com.example.androidhandlerexample;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class HandlerImplementation extends Handler {
    private ProgressBar pb;
    private TextView textView;

    public HandlerImplementation(ProgressBar pb, TextView textView) {
        this.pb=pb;
        this.textView = textView;

    }

    @Override
    public void handleMessage(@NonNull Message msg) {
        super.handleMessage(msg);
        String s = msg.obj.toString();
        Log.d("OnHandler",s);
        textView.setText(s);
        pb.setProgress(Integer.parseInt(s));


    }
}
