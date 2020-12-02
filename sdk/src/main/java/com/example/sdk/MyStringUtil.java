package com.example.sdk;

/**
 * @author AlienChao
 * @date 2020/12/02 11:03
 */
public class MyStringUtil {
    public static String ndkString()
    {
        return getStringNDK();
    }

    private static native String getStringNDK();

    static{
        System.loadLibrary("native-lib");
    }

}
