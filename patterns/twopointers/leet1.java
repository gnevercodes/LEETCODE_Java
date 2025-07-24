
public class leet1 {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int[] ans = {0, 0};
        int first = 0;
        // int second = 1 ; 

        for (int second = 1; second < nums.length; second++) {
            if ((nums[first] + nums[second]) == target) {
                ans[0] = first;
                ans[1] = second;
            }
        }
        return ans;
    }
}
