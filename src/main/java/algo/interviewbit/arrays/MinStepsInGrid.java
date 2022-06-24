package algo.interviewbit.arrays;

public class MinStepsInGrid {


     class Solution {
        public int coverPoints(int[] A, int[] B) {
            int count = 0;

            for (int i = 0; i < A.length-1; i++) {
                int x = A[i];
                int y = B[i];
                int next = i+1;
                int x2 = A[next];
                int y2 = B[next];
                int stepsCount = steps(x, y, x2, y2);
                count=count+stepsCount;

            }
            return count;
        }

        private int steps(int x, int y, int x2, int y2) {
            int count = 0;
            while (!(x == x2 && y == y2)) {

                if (x > x2) {
                    x--;
                } else if (x < x2) {
                    x++;
                }
                if (y > y2) {
                    y--;
                } else if (y < y2) {
                    y++;
                }
                count++;
            }
            return count;
        }
    }


}
