package com.eliteams.quick4j.core.feature.orm.dialect;

/**
 * MySQL数据库方言
 * 
 * @author StarZou
 * @since 2014年5月18日 下午1:32:52
 **/
public class MySql5Dialect extends Dialect {

    protected static final String SQL_END_DELIMITER = ";";

    @Override
    public String getLimitString(String sql, int offset, int limit) {
        return MySql5PageHepler.getLimitString(sql, offset, limit);
    }

    @Override
    public String getCountString(String sql) {
        return MySql5PageHepler.getCountString(sql);
    }
}
