package com.chlsmile.manage.util;

import com.google.gson.Gson;

/**
 * Function:
 * User: chl_smile@163.com
 */
public class GsonUtil {

    /**
     * toJsonString 转成json格式字符串
     *
     * @param object
     * @return
     */
    public static String toJsonString(Object object){
        Gson gson=new Gson();
        return gson.toJson(object);
    }
}
