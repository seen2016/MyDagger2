package com.example.bjb184.mydagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bjb184.mydagger2.bean.Product;
import com.example.bjb184.mydagger2.bean.User;
import com.example.bjb184.mydagger2.di.componet.DaggerAppComponet;
import com.example.bjb184.mydagger2.di.scope.UNmae;


import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @UNmae(value = "a")
    @Inject
    User user;

    @UNmae(value = "b")
    @Inject
    User user2;
    private TextView textView,textView2;

    @Inject
    Product product;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication)getApplication()).getUserComponent().inject(this);
        textView = findViewById(R.id.tv_text);
        textView2 = findViewById(R.id.tv_text2);
//        user.setName("seen");
        textView.setText(user.getAddress());
//        textView2.setText(product.getId()+"");
        textView2.setText(product.getPrice()+"");
    }



}
