public class twoSum {
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        for(int i: twoSumFunc(arr, 9)) System.out.println(i);
    }

    static int[] twoSumFunc(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0, n = nums.length; i < n; i++){
            int j = i + 1;
            while(j < n){
                if((nums[i] + nums[j]) - target == 0){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
                j++;
            }
        }
        return ans;
    }
}
