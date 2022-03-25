package com.example.mvpsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Contact.View{

    private EditText etName,etDesc;
    private Button btnLoad;
    private TextView tvName,tvDes;
    private Contact.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=findViewById(R.id.et_name);
        etDesc=findViewById(R.id.et_des);
        btnLoad=findViewById(R.id.btn_load);
        tvName=findViewById(R.id.tv_name);
        tvDes=findViewById(R.id.tv_desc);

        presenter=new Presenter(this,new MyModel());
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              presenter.onButtonClick(etName.getText().toString(),etDesc.getText().toString());
            }
        });
    }

    @Override
    public void setString(String name,String des) {
         tvName.setText(name);
         tvDes.setText(des);
    }
}