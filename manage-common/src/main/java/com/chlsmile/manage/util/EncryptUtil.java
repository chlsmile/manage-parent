package com.chlsmile.manage.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Function:加密工具类
 * User: chl_smile@163.com
 */
public class EncryptUtil {


    /**
     * sha1Hex 对指定的字符串进行sha1加密,返回加密后的16进制数
     *
     * @param data 待加密的字符串
     *
     * @return  sha1加密后的16进制数
     */
    public static String sha1Hex(String data){
        return DigestUtils.sha1Hex(data);
    }
}
