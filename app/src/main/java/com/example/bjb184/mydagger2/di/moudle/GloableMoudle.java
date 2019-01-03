package com.example.bjb184.mydagger2.di.moudle;

import com.example.bjb184.mydagger2.bean.Product;
import com.example.bjb184.mydagger2.bean.User;
import com.example.bjb184.mydagger2.di.scope.UNmae;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/*
 *
 *作者：BJB184
 *日期：19/01/02
 */
@Module
public class GloableMoudle {


    /**
     * 通过 provides 注入来 获取 user
     *
     * @return
     */
    @UNmae(value = "b")
    @Singleton
    @Provides
    User getUser() {
        return new User("seens");
    }

    @UNmae(value = "a")
    @Singleton
    @Provides
    User getUsers() {
        return new User("seens", "上海");
    }


    /*@Singleton
    @Provides
    Product getProduct() {
        return new Product(123);
    }*/

}
