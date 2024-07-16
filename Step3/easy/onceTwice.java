package easy;
public class onceTwice {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }

    static int singleNumber(int[] nums){
        /* Arrays.sort(nums);
        int i = 0;
        while((i + 2) < nums.length){
            if(nums[i] != nums[i+1]) return nums[i];
            i += 2;
        }
        return nums[nums.length - 1]; <--- This is the Sorting Method. Below is XOR method*/
        
        int ans = 0;
        for(int i: nums) ans ^= i;
        return ans;
    }
}
