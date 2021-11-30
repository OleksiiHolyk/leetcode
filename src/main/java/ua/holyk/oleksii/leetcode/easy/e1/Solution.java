/*
 * Copyright Oleksii Holyk(c) 2021.
 */

package ua.holyk.oleksii.leetcode.easy.e1;

/*
 * 1. Two Sum
 * */
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            Result result = checkSum(i, nums[i], Arrays.copyOfRange(nums, i + 1, nums.length), target);
            if (result.isPair){
                return new int[]{result.firstIndex, result.secondIndex};
            }

        }
        return new int[0];
    }

    private Result checkSum(int iterationNumber, int firstValue, int[] originalArray, int target) {
        for (int i = 0; i < originalArray.length; i++) {
            if (firstValue + originalArray[i] == target) {
                return new Result(iterationNumber,  iterationNumber + i + 1, true);
            }
        }
        return new Result();
    }

    class Result {
        int firstIndex;
        int secondIndex;
        boolean isPair;

        public Result(int firstIndex, int secondIndex, boolean isPair) {
            this.firstIndex = firstIndex;
            this.secondIndex = secondIndex;
            this.isPair = isPair;
        }

        public Result() {
        }
    }
}
