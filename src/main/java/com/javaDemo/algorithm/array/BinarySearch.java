package com.javaDemo.algorithm.array;

import java.util.*;

/**
 * 二分查找
 *
 * @author WMING
 * 2023/09/05
 */
public class BinarySearch {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int numLen = s.nextInt();
        int[] nums = new int[numLen];
        for (int i = 0; i < numLen; i++) {
            nums[i] = s.nextInt();
        }
        s.nextLine();
        int target = s.nextInt();
        BinarySearch search = new BinarySearch();
        System.out.println(search.search(nums, target));
    }


    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else if (target == nums[mid]) {
                return mid;
            }
        }
        return -1;
    }
}