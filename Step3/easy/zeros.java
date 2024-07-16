package easy;
public class zeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,3,4,5};
        zeroEnd(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
    static void zeroEnd(int[] nums){
        int index = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) if(nums[i] != 0) nums[index++] = nums[i];
        
        while(index < n) nums[index++] = 0;
    }
}
