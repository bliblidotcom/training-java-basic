package project;


public class BubbleSort {
    public BubbleSort() {

    }
    public Integer[] sort(Integer[] array){
        if(array == null){
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        for(int i = 0 ; i < array.length ; ++i){
            for(int j = 0; j < i ; ++j){
                if(array[i] < array[j]){
                    Integer temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
