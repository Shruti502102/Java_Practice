/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author Student
 */
public class reversearray {

    // Helper method to reverse a portion of the array
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Main method to rotate the array to the right by k steps
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Handle if k > n

        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the rest
        reverse(nums, k, n - 1);
    }

    // To test the code
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);

        // Print rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
