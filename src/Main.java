import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};

        int[] nums3 = new int[]{4,1,2};
        int[] nums4 = new int[]{1,3,4,2};

        int[] res = solution.nextGreaterElement(nums1, nums2);
        for(int i = 0; i != res.length; i++){
            System.out.println(res[i]);
        }
    }
}