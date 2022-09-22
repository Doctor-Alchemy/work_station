package com.zjrcu.itf.InitializingBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class TestInitialize implements InitializingBean {
    private static final Logger logger= LoggerFactory.getLogger(TestInitialize.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("!!!Initializing TestComponent class!!!");
        printWay();
    }
    public void printWay(){
        System.out.println("!!!use printWay() way!!!");
    }
}
