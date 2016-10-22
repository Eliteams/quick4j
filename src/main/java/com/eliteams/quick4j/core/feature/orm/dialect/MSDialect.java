package com.eliteams.quick4j.core.feature.orm.dialect;

/**
 * MSSQL 数据库方言
 * 
 * @author StarZou
 * @since 2014年5月18日 下午1:32:33
 **/
public class MSDialect extends Dialect {

    protected static final String SQL_END_DELIMITER = ";";

    @Override
    public String getLimitString(String sql, int offset, int limit) {
        return MSPageHepler.getLimitString(sql, offset, limit);
    }

    @Override
    public String getCountString(String sql) {
        return MSPageHepler.getCountString(sql);
    }
}
