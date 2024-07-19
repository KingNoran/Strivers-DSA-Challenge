package easy;
public class maxOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i = 0, n = nums.length; i < n; i++){
            if(nums[i] == 1){
                count++;
            } else {
                max = Math.max(max,count);
                count = 0;
            }
        }
        return Math.max(max,count);
    }
    
}
