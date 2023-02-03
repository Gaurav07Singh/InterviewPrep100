package arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEveryElement {
    public static void main(String[] args) {


        int[] arr = {1,2,1,3,1,2,5,6,2,5,6,9,2,5,6,3,2,5,6,3,2,5,6,3,2,5,6};
        countFreq(arr);
    }
    static void countFreq(int[] arr)
    {
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int x:arr)
        {
            h.put(x,h.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer,Integer> e : h.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
