package com.eliteams.quick4j.core.feature.orm.dialect;

/**
 * Postgre 数据库 方言
 * 
 * @since 2014年7月2日 上午10:30:24
 **/
public class PostgreDialect extends Dialect {

    protected static final String SQL_END_DELIMITER = ";";

    @Override
    public String getLimitString(String sql, int offset, int limit) {
        return PostgrePageHepler.getLimitString(sql, offset, limit);
    }

    @Override
    public String getCountString(String sql) {
        return PostgrePageHepler.getCountString(sql);
    }
}
