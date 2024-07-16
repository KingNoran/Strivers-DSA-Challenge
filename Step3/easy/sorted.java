package easy;

public class sorted {
    public static void main(String[] args) {
        int[] nums = new int[]{5,5,6,6,6,9,1,2} ;
        System.out.println(checkSort(nums));
    }

    static boolean checkSort(int[] nums){
        int count = 0;
        if (nums[0] < nums[nums.length - 1]) {
                count++;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
}
