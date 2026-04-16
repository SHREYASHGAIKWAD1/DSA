package MyArrays;

public class MergeArraysLeetCode {

    //Less Space taken and more optimised.
    public void mergeInPlace(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while(j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    //Optimised but Space compromised!
    public void mergeWithNewArray(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[nums1.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                arr[index] = nums1[i];
                index++;
                i++;
            } else {
                arr[index] = nums2[j];
                index++;
                j++;
            }
        }

        while(i < m) {
            arr[index] = nums1[i];
            index++;
            i++;
        }

        while(j < n) {
            arr[index] = nums2[j];
            index++;
            j++;
        }

        for(int k = 0; k < nums1.length; k++) {
            nums1[k] = arr[k];
        }
    }
}
