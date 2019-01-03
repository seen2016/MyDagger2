package com.example.bjb184.mydagger2.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/*
 *
 *作者：BJB184
 *日期：19/01/02
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface UNmae {
    String value() default "";

}
