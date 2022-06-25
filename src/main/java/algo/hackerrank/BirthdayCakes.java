package algo.hackerrank;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakes {


    public static void main(String[] args) {

        birthdayCakeCandles(Arrays.asList(3,2,1,3,3,2,4,2,-2,3));
    }



    public static int birthdayCakeCandles(List<Integer> candles) {

        int max = 0;
        int frequency=0;

        max = candles.get(0);
        frequency=1;

        for(int i=1; i<candles.size(); i++){
            if(candles.get(i) == max){
                frequency++;
            } else if(candles.get(i)>max){
                max=candles.get(i);
                frequency=1;
            }

        }
        return frequency;
    }


}
