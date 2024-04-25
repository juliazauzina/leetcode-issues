package org.example;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
            }
        }
        int [] numbers = new int[k];
        int b = 0;
        for (int i =0; i < nums.length; i++) {
            if(nums[i] != val){
                numbers[b] = nums[i];
                b++;
            }
        }

        for (int i =0; i < numbers.length; i++) {
            nums[i] = numbers[i];
        }
        return k;
    }
}
