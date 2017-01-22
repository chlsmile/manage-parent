package com.chlsmile.manage.util;

import com.chlsmile.manage.common.PageQuery;

/**
 * Function:分页工具
 * User: chl_smile@163.com
 */
public class PageUtil {

    private static final int PAGE_SIZE_DEFAULT=100;

    private static final int PAGE_START_DEFAULT=1;

    /**
     * getPageQuery 获取分页查询分页参数
     *
     * @param pageStart
     * @param pageSize
     *
     * @return 获取分页查询分页参数
     */
    public static PageQuery getPageQuery(int pageStart, int pageSize){

        pageSize=(pageSize<0)?PAGE_SIZE_DEFAULT:pageSize;

        pageStart=(pageStart<1)?PAGE_START_DEFAULT:pageStart;

        int offset=(pageStart-1)*pageSize;

        return new PageQuery(offset,pageSize);
    }
}
