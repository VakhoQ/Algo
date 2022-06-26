package algo.hackerrank;

import java.util.Arrays;
import java.util.List;

public class ApplesAndOranges {


    public static void main(String[] args) {

        countApplesAndOranges(7,11,5,15, Arrays.asList(-2,2,1,3), Arrays.asList(5,-6));
        System.out.println("======");
        countApplesAndOranges(2,3,1,5, Arrays.asList(2), Arrays.asList(-2));

    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int applCount=0;
        for(int i=0; i<apples.size(); i++){
            if(a+apples.get(i) >=s && a+apples.get(i)<=t){
                applCount++;
            }
        }

        int orangeCount=0;
        for(int i=0; i<oranges.size(); i++){
            if(b+oranges.get(i) <=t && b+oranges.get(i)>=s){
                orangeCount++;
            }
        }
        System.out.println(applCount);
        System.out.println(orangeCount);
    }
}
