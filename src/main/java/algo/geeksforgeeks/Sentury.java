package algo.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sentury {

    public static void main(String[] args) {

        int a [] = {1, 1, 2, 2, 1};

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<a.length; i++){

            int n = a[i];

            if(map.containsKey(n)){
                map.put(n, i);
            }else{
                map.put(n, -1);
            }
        }

        Integer minIndex =  Integer.MAX_VALUE;
        Integer key =null;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()!=-1 && e.getValue() < minIndex ){
                minIndex = e.getValue();
                key = e.getKey();
            }
        }


                

        System.out.println(key);

    }


  static  int solution(int year) {



        return year/100;



    }


}
