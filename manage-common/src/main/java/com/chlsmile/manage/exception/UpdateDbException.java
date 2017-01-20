package com.chlsmile.manage.exception;

/**
 * Function:
 * User: chl_smile@163.com
 */
public class UpdateDbException extends RuntimeException {

    public UpdateDbException(){
    }

    public UpdateDbException(String message){
        super(message);
    }
}
