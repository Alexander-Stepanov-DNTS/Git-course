class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for(int i = 0; i != nums1.length; i++) {
            int j = 0;
            while(nums1[i] != nums2[j]) {
                j++;
            }
            int remember = j;
            for(; j != nums2.length; j++){
                if(nums2[j] > nums2[remember]) {
                    res[i] = nums2[j];
                    break;
                }
            }
            if(j == nums2.length) {
                res[i] = -1;
            }
        }
        return res;
    }
}