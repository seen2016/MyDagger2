package com.example.bjb184.mydagger2.di.componet;

import android.arch.lifecycle.AndroidViewModel;

import com.example.bjb184.mydagger2.MyApplication;
import com.example.bjb184.mydagger2.di.moudle.BaseMoudle;
import com.example.bjb184.mydagger2.di.moudle.GloableMoudle;
import com.example.bjb184.mydagger2.di.moudle.UserMoudle;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/*
 *
 *作者：BJB184
 *日期：19/01/02
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class,GloableMoudle.class, BaseMoudle.class})
public interface AppComponet {
    UserComponent plus(UserMoudle userMoudle);
    void inject(MyApplication application);
}
