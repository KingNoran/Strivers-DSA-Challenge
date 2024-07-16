public class zeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        for(int i: arr) System.out.println(i);
        
    }

    static void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        int left = i;
        int right = j;
        while(i <= j){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left++] = temp;
            }
            i++;
        }
        while(j > left - 1){
            if(nums[j] == 2){
                int temp = nums[j];
                nums[j] = nums[right];
                nums[right--] = temp;
            }
            j--;
        }
    }
}
