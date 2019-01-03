package com.example.bjb184.mydagger2.bean;

import com.example.bjb184.mydagger2.di.scope.UserScope;

import javax.inject.Inject;
import javax.inject.Singleton;

/*
 *
 *作者：BJB184
 *日期：19/01/02
 */
@Singleton
public class Product {
//    @Inject
    Integer id;
    double price;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Inject
    public Product(Integer id,double price) {
        this.id = id;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
