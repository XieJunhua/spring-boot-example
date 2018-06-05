package com.junhua.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by xiejunhua on 2017/5/18.
 */
//@Configuration
public class MysqlDatasourceConfig {

//    @Bean
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource primaryDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.secondDatasources")
//    public DataSource secondaryDataSource() {
//        return DataSourceBuilder.create().build();
//    }




}
