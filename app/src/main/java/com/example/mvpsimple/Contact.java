package com.example.mvpsimple;

public interface Contact {


    interface View{

       void setString(String name,String des);
    }
    interface Model{
        interface onFinishListener{
            void onFinish();
        }

        void getdata(Contact.Model.onFinishListener onFinishListener);

    }
    interface Presenter{
      void onButtonClick(String name ,String des);
    }

}
