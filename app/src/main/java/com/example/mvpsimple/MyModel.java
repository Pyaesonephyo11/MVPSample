package com.example.mvpsimple;

import android.os.Handler;
import android.widget.EditText;

import java.util.List;
import java.util.Random;

public class MyModel implements Contact.Model,Contact.View{

    @Override
    public void getdata(onFinishListener onFinishListener) {
      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
              onFinishListener.onFinish();
          }
      },3000);
    }

    @Override
    public void setString(String name, String des) {

    }
}
