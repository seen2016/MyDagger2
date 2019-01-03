package com.example.bjb184.mydagger2;

import android.app.Application;

import com.example.bjb184.mydagger2.bean.User;
import com.example.bjb184.mydagger2.di.componet.AppComponet;
import com.example.bjb184.mydagger2.di.componet.DaggerAppComponet;
import com.example.bjb184.mydagger2.di.componet.UserComponent;
import com.example.bjb184.mydagger2.di.moudle.UserMoudle;
import com.example.bjb184.mydagger2.di.scope.UNmae;

import javax.inject.Inject;

/*
 *作者：BJB184
 *日期：19/01/02
 */
public class MyApplication extends Application {
    @UNmae(value = "a")
    @Inject
    User user;

    private static final String TAG = "MyApplication";

    private AppComponet appComponet;
    private UserComponent userComponent;

    public AppComponet getAppComponet() {
        return appComponet;
    }

    public void setAppComponet(AppComponet appComponet) {
        this.appComponet = appComponet;
    }

    public UserComponent getUserComponent() {
        return userComponent;
    }

    public void setUserComponent(UserComponent userComponent) {
        this.userComponent = userComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponet = DaggerAppComponet
                .builder()
                .build();
        userComponent= appComponet.plus(new UserMoudle());
        appComponet.inject(this);
//        DaggerAppComponet.create().inject(this);
//        DaggerAppComponet.create().inject(this);
//        user.setName("seen");
        System.out.println("username:" + user.getName());
//        Log.e(TAG, "onCreate: " );
    }
}
