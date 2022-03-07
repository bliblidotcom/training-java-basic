package project;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }
    public List<String> getTasks(){
        return this.tasks;
    }
    public void add(String task){
        validateNull(task);
        tasks.add(task);
    }
    public void remove(String task){
        validateNull(task);
        tasks.remove(task);
    }
    public void print(){
        for (String task : tasks) {
            System.out.println(task);
        }
    }
    private void validateNull(String task){
        if(task == null){
            throw new IllegalArgumentException("Parameters cannot be null");
        }
    }
}
