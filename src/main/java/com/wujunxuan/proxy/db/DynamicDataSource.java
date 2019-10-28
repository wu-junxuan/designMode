package com.wujunxuan.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {


    protected Object determineCurrentLookupKey() {

        return DataSourceContextHolder.getDBType();
    }
}
