public class maxSub {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }   
    
    static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            count += nums[i];
            if(count > ans) ans = count;
            if(count < 0) count = 0;
        }
        return ans;
    }
}
