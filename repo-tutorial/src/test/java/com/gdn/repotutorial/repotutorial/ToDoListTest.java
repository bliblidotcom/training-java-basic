package com.gdn.repotutorial.repotutorial;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class ToDoListTest {

    private static List<Task> taskList = new LinkedList<Task>();
    private static Logger log = LoggerFactory.getLogger(ToDoList.class);
    private static ToDoList test = new ToDoList();

    @Test
    public void addKegiatanTest() throws Exception{
        test.addKegiatan("Test", taskList);
        if(taskList.isEmpty() || !taskList.get(taskList.size()-1).getTask().equals("Test")){
            log.info("Task Failed");
            throw new Exception();
        }
    }

    @Test
    public void updateKegiatanTest() throws Exception{
        test.addKegiatan("Hmm", taskList);
        test.updateKegiatan(0, taskList);
        if(!taskList.get(0).getStatus()){
            log.info("Task Failed");
            throw new Exception();
        }
    }

    @Test
    public void deleteKegiatanTest() throws Exception{
        String temp = taskList.get(0).getTask();
        test.deleteKegiatan(0, taskList);
        if(taskList.contains(temp)){
            log.info("Task Failed");
            throw new Exception();
        }
    }


}
