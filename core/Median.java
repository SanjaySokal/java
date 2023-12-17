package core;

import java.util.ArrayList;
import java.util.Collections;

public class Median {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        Median median = new Median();
        System.out.println(median.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Double> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            list.add((double) nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            list.add((double) nums2[i]);
        }

        Collections.sort(list);

        // System.out.println(list.get(list.size() / 2));

        if (list.size() % 2 == 1) {
            return list.get(list.size() / 2);
        } else {
            return ((list.get(list.size() / 2) + list.get((list.size() / 2) - 1)) / 2);
        }
    }
}