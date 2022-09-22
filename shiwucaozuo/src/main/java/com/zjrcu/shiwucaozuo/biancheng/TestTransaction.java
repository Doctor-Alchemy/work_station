package com.zjrcu.shiwucaozuo.biancheng;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public class TestTransaction {
    @Test
    public void test1() throws Exception {
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
        //2.定义事务属性：TransactionDefinition，
        // TransactionDefinition可以用来配置事务的属性信息，比如事务隔离级别、事务超时时间、事务传播方式、是否是只读事务等等。
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        //3.开启事务：调用platformTransactionManager.getTransaction开启事务操作，得到事务状态(TransactionStatus)对象
        TransactionStatus transactionStatus = platformTransactionManager.getTransaction(transactionDefinition);
        //4.执行业务操作，执行2个插入操作
        try {
            System.out.println("before:" + jdbcTemplate.queryForList("SELECT * from b_user"));
            jdbcTemplate.update("insert into b_user (name) values (?)", "zhangsan");
            jdbcTemplate.update("insert into b_user (name) values (?)", "lisi");
            //5.提交事务：platformTransactionManager.commit
            platformTransactionManager.commit(transactionStatus);
        } catch (Exception e) {
            //6.回滚事务：platformTransactionManager.rollback
            platformTransactionManager.rollback(transactionStatus);
        }
        System.out.println("after:" + jdbcTemplate.queryForList("SELECT * from b_user"));
    }

}
