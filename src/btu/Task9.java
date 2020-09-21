package btu;
import java.util.*;

public class Task9 {

    public void Task9(){
        int[] my_array = new int[]{15, 9, -5, 30, 64, 99, 87, 5};

        System.out.format("\n%s\nMax: %d\nMin: %d\n", Arrays.toString(my_array), maximum(my_array), minimum(my_array));
    }
    private int maximum(int[] some_array){
        int max = 0;

        for(int i = 0; i < some_array.length; i++)
            if(some_array[i] > max)
                max = some_array[i];

        return max;
    }
    private int minimum(int[] some_array){
        int min = 0;

        for(int i = 0; i < some_array.length; i++)
            if(some_array[i] < min)
                min = some_array[i];

        return min;
    }
}
