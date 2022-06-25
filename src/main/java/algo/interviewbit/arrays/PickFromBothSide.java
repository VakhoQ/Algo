package algo.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickFromBothSide {


    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(-584, -714, -895, -512, -718, -545, 734, -886, 701, 316, -329, 786, -737, -687, -645, 185, -947, -88, -192, 832, -55, -687, 756, -679, 558, 646, 982, -519, -856, 196, -778, 129, -839, 535, -550, 173, -534, -956, 659, -708, -561, 253, -976, -846, 510, -255, -351, 186, -687, -526, -978, -832, -982, -213, 905, 958, 391, -798, 625, -523, -586, 314, 824, 334, 874, -628, -841, 833, -930, 487, -703, 518, -823, 773, -730, 763, -332, 192, 985, 102, -520, 213, 627, -198, -901, -473, -375, 543, 924, 23, 972, 61, -819, 3, 432, 505, 593, -275, 31, -508, -858, 222, 286, 64, 900, 187, -640, -587, -26, -730, 170, -765, -167, 711, 760, -104, -333));


        int b = 32;
        int r = new PickFromBothSide().solve(a, b);

        System.out.println(r);
    }

    public int solve(ArrayList<Integer> A, int B) {

        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A.get(i);
        }
        int maxSum = sum;

        int i = B - 1;
        int j = A.size() - 1;

        while (i>=0 && j>=0) {
            sum -= A.get(i--);
            sum += A.get(j--);
            maxSum = sum > maxSum ? sum : maxSum;
        }
        return maxSum;

    }

}
