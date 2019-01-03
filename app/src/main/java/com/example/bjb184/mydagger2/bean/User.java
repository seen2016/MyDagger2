package com.example.bjb184.mydagger2.bean;

/*
 *作者：BJB184
 *日期：19/01/02
 */
import com.example.bjb184.mydagger2.di.scope.UNmae;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Provides;

//@Singleton
public class User {

    private String name;
    private String address;
    private String telphone;

    /**
     * 通过inject 来注入
     * @param name
     */
//    @Inject
    public User(String name) {
        this.name = name;
    }
    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
}
