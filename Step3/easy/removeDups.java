package easy;
public class removeDups {
    public static void main(String[] args) {
        int[] nums = {50,0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums){
        if(nums.length == 0) return 0; 
        int i = 0;
        for(int j = i + 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
