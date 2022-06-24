package algo.interviewbit.timecomplexity;

import java.util.Arrays;

public class WordCount {

    public static void main(String[] args) {
        System.out.println(  Solution.solve(" hasta la vista " ));
    }


    static class Solution {
        public static  int solve(String A) {

            return  Math.toIntExact(Arrays.stream(A.split("(\\s+)"))
                    .filter(e->!e.isEmpty())
                    .count());
        }
    }
}


