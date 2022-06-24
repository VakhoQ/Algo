package algo.princeton.sort;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {
        new MergeSort().init();
    }

    private void init() {
        Integer [] arr = {-8,777,222,3,3,2,1,5,6};
        Integer [] aux = new Integer[arr.length];
        sort(arr, aux, 0, arr.length - 1);
        Arrays.stream(arr).forEach(e-> System.out.println(e));

    }

    private void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {

        if (hi == lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }


    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

        /**
         * Copy data into the aux.
         */
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        /** Pointers */
        int i = lo;
        int j = mid + 1;

        /**
         * Iterate from lo to hi index.
         */
        for (int k = lo; k <= hi; k++) {

            /** if i> mid, it means that, we should continue to get element from j++ pointer. */
            if (i > mid) {
                a[k] = aux[j++];
            }

            /** If J > hi, we should continue to get element from i++ pointer */
            else if (j > hi) {
                a[k] = aux[i++];
            }

            /** id aux[j] element is less then aux[i], we should get smallest one, so it will be aux[j++] */
            else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            }

            /** if aux[j] is more then aux[i], we should get smallest one, so it will be aux[i++] */
            else {
                a[k] = aux[i++];
            }
        }
    }

    private static boolean less(Comparable j, Comparable i) {
        if (j.compareTo(i) < 0) {
            return true;
        } else {
            return false;
        }
    }


}
