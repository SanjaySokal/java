package core;

import java.util.*;

public class RemoveDulplicates {
    public static void main(String[] args) {
        RemoveDulplicates dulplicates = new RemoveDulplicates();
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // int[] arr = { 1, 1, 2 };
        System.out.println(dulplicates.removeDuplicates(arr));
    }

    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        System.out.println(set);
        return set.size();
    }
}
