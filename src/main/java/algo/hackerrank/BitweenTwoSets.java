package algo.hackerrank;

import java.util.List;

public class BitweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int count = 0;

        for(int k = 1; k <= 100; k++) {
            boolean found = true;
            for(int i = 0; i < a.size(); i++) {
                if(k % a.get(i) != 0) {
                    found = false;
                }
            }
            for(int i = 0; i < b.size(); i++) {
                if(b.get(i) % k != 0) {
                    found = false;
                }
            }
            if(found) {
                count++;
            }
        }
        return count;

    }

}
