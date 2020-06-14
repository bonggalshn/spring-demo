package com.example.demo.core.model.util;

public class AssertUtil {
    public static void notNull(Object object, String message) {
        if (null != object) {
            return;
        }

        try {
            throw new Exception(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void isTrue(boolean bool, String message) {
        if (bool){
            return;
        }

        try{
            throw new Exception(message);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
