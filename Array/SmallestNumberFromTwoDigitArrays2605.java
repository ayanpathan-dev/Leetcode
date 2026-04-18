import java.util.Arrays;

public class SmallestNumberFromTwoDigitArrays2605 {
     public int minNumber(int[] nums1, int[] nums2) {
        int small = -1;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (small == -1 || small > nums1[i]) {
                        small = nums1[i];
                    }
                }
            }
        }
        System.out.println(small);
        if (small == -1) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            if (nums1[0] < nums2[0]) {
                return (nums1[0] * 10) + nums2[0];
            } else {
                return (nums2[0] * 10) + nums1[0];
            }

        } else {
            return small;
        }

    }
}
