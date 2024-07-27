public class subarrequalsK {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(subarraySum(arr, 2));
    }
    
    static int subarraySum(int[] nums, int k){
        int count = 0, cur = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                cur+=nums[j];
                if(cur == k) count++;
            }
        }
        return count;
    }
}
