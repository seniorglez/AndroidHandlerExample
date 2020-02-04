package com.example.androidhandlerexample;

import android.os.Message;
import android.util.Log;
import android.widget.EditText;

public class ThreadImplementation extends Thread {
    private HandlerImplementation handlerImplementation;
    private EditText editText;
    public ThreadImplementation(HandlerImplementation handlerImplementation,EditText editText){
        this.handlerImplementation=handlerImplementation;
        this.editText=editText;
    }
    @Override
    public void run(){
        super.run();
        for (int i = 1; i <= Integer.parseInt(editText.getText().toString()); i++) {
        Log.d("OnThread",String.valueOf(i));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            Message mes=new Message();
            mes.obj=new Integer(i);
            handlerImplementation.sendMessage(mes);

        }

    }

}
