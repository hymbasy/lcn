package com.alex.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LcnDemo1 {

    private static Logger logger = LoggerFactory.getLogger(LcnDemo1.class);

    private static void getLocalip() {
        try {
            System.out.println("服务暴露的ip: " + java.net.InetAddress.getLocalHost().getHostAddress());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        getLocalip();
        logger.info("开始启动asset");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        context.start();
        synchronized (LcnDemo1.class) {
            while (true) {
                try {
                    LcnDemo1.class.wait();
                } catch (Throwable e) {
                }
            }
        }
    }
}
