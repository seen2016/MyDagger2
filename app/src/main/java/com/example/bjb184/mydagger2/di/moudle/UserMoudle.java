package com.example.bjb184.mydagger2.di.moudle;

import com.example.bjb184.mydagger2.bean.User;
import com.example.bjb184.mydagger2.di.scope.UserScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/*
 *
 *作者：BJB184
 *日期：19/01/02
 */

@Module
public class UserMoudle {

    @Provides
    String getString(){
        return new String();
    }

    /**
     * 通过 provides 注入来 获取 user
     * @return
     */
   /* @UserScope
    @Provides
    User getUser(){
       return new User("seens");
    }*/

}
