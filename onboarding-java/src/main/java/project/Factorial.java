package project;

public class Factorial {
    public Factorial() {
    }
    public Integer compute(Integer value){
        if(value == null){
            throw new IllegalArgumentException("Parameters cannot be null");
        }
        if(value < 0){
            throw new IllegalArgumentException("Parameters cannot be negative value");
        }
        Integer result = 1;
        for(Integer i = 2; i <= value ; ++i){
            result *= i;
        }
        return result;
    }
}
