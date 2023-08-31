import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int a = nums.length;

        for (int i = 0; i < a - 1; i++) { // {2,3,4}-->target==7 =>{1,2}
            for (int j = 1; j < a; j++) {
                if(nums[i]+nums[j]==9){
                    return new int[]{i,j};
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return new int[]{};
        
    }
}
