package com.example.mvpsimple;

public class Presenter implements Contact.Presenter,Contact.Model.onFinishListener{

    private Contact.View mainView;
    private Contact.Model model;

    public Presenter(Contact.View mainView, Contact.Model model) {
        this.mainView = mainView;
        this.model = model;
    }

    @Override
    public void onFinish() {

    }

    @Override
    public void onButtonClick(String name,String des) {
        if (mainView!=null){
            mainView.setString(name,des);
        }

        //model.getdata(this);
    }
}
