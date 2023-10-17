/*
 * @lc app=leetcode id=912 lang=java
 *
 * [912] Sort an Array
 */

// @lc code=start
class Solution {
    // TC O(nlogn) base: 2
    // SC O(n)
    public int[] sortArray(int[] nums) {
        int left = 0, right = nums.length - 1;
        mergeSort(nums, left, right);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        // TC (n* log n ) n* recursive
        // SC O(n)
        if (left < right) // left --> right
        {
            int mid = left + (right - left) / 2; // (left+right) /2 ==> overflow if(left too small)
            mergeSort(nums, left, mid);// leftpartition
            mergeSort(nums, mid + 1, right);// right partition
            merge(nums, left, mid, right); // A = nums[left-> mid] ; B = nums[mid+1-> right]
        }
    }

    private void merge(int[] nums, int left, int mid, int right) {
        // TC O(n)
        int n1 = mid - left + 1;// size of left A
        int n2 = right - mid;
        int[] A = new int[n1];
        int[] B = new int[n2];
        for (int i = 0; i < n1; i++) {
            A[i] = nums[left + i];
        }
        for (int i = 0; i < n2; i++) {
            B[i] = nums[(mid + 1) + i];
        }
        // left - mid -> A; mid+1-> right > B; nums[left -> right]
        int i = 0 // A
                , j = 0 // B
                , k = left;
        while (i < n1 && j < n2) {// i, j valid
            // unit compare
            if (A[i] <= B[j]) {
                nums[k++] = A[i++];

            } else {
                nums[k++] = B[j++];
            }
        }

        // if out of bound
        // [1,2,3]i ,[5,6,7]
        while (i < n1)
            nums[k++] = A[i++];
        while (j < n2)
            nums[k++] = B[j++];
    }

}
// @lc code=end
// root divide (n/2) to leave --> merge

// divide partition (pointer R, L, M(R+L/2))
// L: l ->M
// R: M+1 -> R
/*
 * [4,2,5,8,6,9,1]
 * [4,2,5,8] M = 0+3/2 ->index 1(M = 2)
 * [4,2] M = 1
 * [4] (L<R): false
 * 
 * [2]
 * Merge two sorted arrays
 * [4][2]-->[2,4]
 * 
 * 
 * [5,8]
 * ---------------------------
 * 
 * 
 * [6,9,1]index 1(M = 9)
 * 
 * 
 * [6,9]
 * 
 * [1]
 * mergeSrot(nums, left, right)
 * if l< r
 * m = l+(r-l)/2;
 * mergeSort(nums, left, mid);
 * mergeSort(nums, mid+1, right);
 * merge(nums,left, mid, right);
 * A = [l, mid]
 * B= [mid+1, r]
 */
