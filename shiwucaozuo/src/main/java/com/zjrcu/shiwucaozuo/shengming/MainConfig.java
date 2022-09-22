package com.zjrcu.shiwucaozuo.shengming;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@EnableTransactionManagement //@1
@Configuration
@ComponentScan
public class MainConfig {
    //定义一个数据源
    @Bean
    public DataSource dataSource() {
        org.apache.tomcat.jdbc.pool.DataSource dataSource = new org.apache.tomcat.jdbc.pool.DataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.94.128:3306/account?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true");
        dataSource.setUsername("alen");
        dataSource.setPassword("alenalen");
        dataSource.setInitialSize(5);
        return dataSource;
    }
    //定义一个JdbcTemplate,用来执行db操作
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
    //定义一个事物管理器
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) { //@2
        return new DataSourceTransactionManager(dataSource);
    }
}
