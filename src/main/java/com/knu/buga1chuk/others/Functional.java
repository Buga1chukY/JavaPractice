package com.knu.buga1chuk.others;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Functional {
    private static final Logger LOG = LoggerFactory.getLogger(Functional.class);

    public static void main(String[] args) {
        Functional a = new Functional();
        a.method1();
        a.method2();
        a.method3("Yaroslav");
        a.method4("lol", "olo");
        a.method5("hello", "world", "!!!");
        a.method6(3, 3.5, '$', "Hello");
        a.method7(true, "Hi", 1.5f, 123456);
    }

    public void method1() {
        LOG.info("method1");
    }

    public void method2() {
        LOG.info("method2");
    }

    public void method3(String param1) {
        LOG.info("method3: '{}'", param1);
    }

    public void method4(String param1, String param2) {
        LOG.info("method4: '{}', '{}'", param1, param2);
    }

    public void method5(String param1, String param2, String param3) {
        LOG.info("method5: '{}', '{}', '{}'", param1, param2, param3);
    }

    public void method6(int param1, Double param2, char param3, String param4) {
        LOG.info("method6: '{}', '{}', '{}', '{}'", param1, param2, param3, param4);
    }

    public void method7(boolean param1, String param2, float param3, long param4) {
        LOG.info("method7: '{}', '{}', '{}', '{}'", param1, param2, param3, param4);
    }

}
