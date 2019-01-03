package com.example.bjb184.mydagger2.di.moudle;

import dagger.Module;
import dagger.Provides;

/*
 *
 *作者：BJB184
 *日期：19/01/02
 */
@Module
public class BaseMoudle {

    @Provides
    String getString() {
        return new String();
    }

    @Provides
    Integer getInteger() {
        return new Integer(0);
    }

    @Provides
    Long getLong() {
        return new Long(0);
    }

    @Provides
    Character getChar() {
        return new Character('1');
    }


    @Provides
    Byte getByte() {
        return new Byte("1");
    }

    @Provides
    Float getFloat() {
        return new Float("1.1");
    }


    @Provides
    Double getDouble() {
        return new Double("1.11");
    }

}
