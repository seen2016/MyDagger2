package com.example.bjb184.mydagger2.di.componet;

import com.example.bjb184.mydagger2.MainActivity;
import com.example.bjb184.mydagger2.di.moudle.UserMoudle;
import com.example.bjb184.mydagger2.di.scope.UserScope;

import javax.inject.Singleton;

import dagger.Subcomponent;

/*
 *
 *作者：BJB184
 *日期：19/01/02
 */
@UserScope
@Subcomponent(modules = UserMoudle.class)
public interface UserComponent {

    void inject(MainActivity activity);
}
