package algo.princeton.sort;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort {


    public static void main(String[] args) {
        Integer [] a = {5,1,2,8,9,3,4,10,2,-1,7,1,3,4,5,6,8,3,1,0,5};
        sort(a);
        Arrays.stream(a).forEach(e-> System.out.print(e + " "));
    }

    public static void sort(Comparable [] a){
        sort(a,0, a.length-1);
    }

    public static void sort(Comparable [] a, int lo, int hi){
        if(hi <=lo) return;
        int j = partition(a,lo,hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }


    public static int partition(Comparable [] a, int lo, int hi){
        int i = lo;
        int j= hi+1;
        while(true){
            while(less(a[++i], a[lo])){
                if(i==hi) break;
            }
            while(more(a[--j], a[lo])){
                if(j==lo) break;
            }
            if(i>=j) break;
            exchange(a, i, j);
        }
        exchange(a, lo, j);
        return j;
    }


    private static boolean less(Comparable i, Comparable j) {
        if (i.compareTo(j) < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean more(Comparable i, Comparable j) {
        return !less(i,j);
    }

    private static void exchange(Comparable [] a, int i, int j){
        Comparable temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
