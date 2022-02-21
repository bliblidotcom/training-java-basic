package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TodoListTest {
    Logger logger = LoggerFactory.getLogger(TodoList.class);
    TodoList tl = TodoList.getInstance();

    @Test
    public void addTest() throws Exception {
        if (!tl.add("asd")) {
            logger.info("Test Failed");
            throw new Exception();
        }

        if (tl.add("asd")) {
            logger.info("Test Failed");
            throw new Exception();
        }
    }

    @Test
    public void removeTest() throws Exception {
        tl.add("asd");
        tl.add("sad");
        tl.add("sda");
        tl.add("dsa");
        tl.add("das");

        if (!tl.remove(0)) {
            logger.info("Test Failed");
            throw new Exception();
        }

        if (!tl.remove(2)) {
            logger.info("Test Failed");
            throw new Exception();
        }

        if (tl.remove(6)) {
            logger.info("Test Failed");
            throw new Exception();
        }

        if (tl.remove(-1)) {
            logger.info("Test Failed");
            throw new Exception();
        }
    }
}
