package com.chlsmile.manage.common;

/**
 * Function:
 * User: chl_smile@163.com
 */
public class PageQuery {

    private int offSet;
    private int limit;

    private PageQuery() {
    }

    public PageQuery(int offSet, int limit) {
        this.offSet = offSet;
        this.limit = limit;
    }

    public int getOffSet() {
        return offSet;
    }

    public void setOffSet(int offSet) {
        this.offSet = offSet;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PageQuery{");
        sb.append("offSet=").append(offSet);
        sb.append(", limit=").append(limit);
        sb.append('}');
        return sb.toString();
    }
}
