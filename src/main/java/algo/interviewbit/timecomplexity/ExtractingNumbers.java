package algo.interviewbit.timecomplexity;

import java.util.Arrays;

public class ExtractingNumbers {

    public static void main(String[] args) {
        //12 + 34 = 46
         Solution.solve("a12b34c");
    }

    static class Solution {

        public static Long solve(String A) {

            return Arrays.stream(A.split("[^0-9]"))
                    .filter(e->!e.isEmpty())
                    .map(e->Long.valueOf(e))
                    .reduce(0l, (a,b) -> a+b);
        }

    }

}

