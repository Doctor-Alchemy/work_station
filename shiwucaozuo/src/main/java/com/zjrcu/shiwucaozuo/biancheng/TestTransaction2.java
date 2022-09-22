package com.zjrcu.shiwucaozuo.biancheng;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.function.Consumer;

public class TestTransaction2 {
    @Test
    public void test2() throws Exception {
        //定义一个数据源
        org.apache.tomcat.jdbc.pool.DataSource dataSource = new org.apache.tomcat.jdbc.pool.DataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.94.128:3306/account?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true");
        dataSource.setUsername("alen");
        dataSource.setPassword("alenalen");
        dataSource.setInitialSize(5);
        //定义一个JdbcTemplate，用来方便执行数据库增删改查
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        //1.定义事务管理器，给其指定一个数据源
        PlatformTransactionManager platformTransactionManager = new DataSourceTransactionManager(dataSource);
        //2.定义事务属性：TransactionDefinition，TransactionDefinition可以用来配置事务的属性信息，比如事务隔离级别、事务超时时间、事务传播方式、是否是只读事务等等。
        DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        transactionDefinition.setTimeout(10);
        //3.创建TransactionTemplate对象
        TransactionTemplate transactionTemplate = new TransactionTemplate(platformTransactionManager,transactionDefinition);
        System.out.println("before:" + jdbcTemplate.queryForList("SELECT * from b_user"));
        transactionTemplate.executeWithoutResult(new Consumer<TransactionStatus>() {
            @Override
            public void accept(TransactionStatus transactionStatus) {
                jdbcTemplate.update("insert into b_user (name) values (?)", "wangwu");
                jdbcTemplate.update("insert into b_user (name) values (?)", "maliu");
            }
        });
        System.out.println("after:" + jdbcTemplate.queryForList("SELECT * from b_user"));
    }
}
