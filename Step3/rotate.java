public class rotate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotateDir(nums, 3,"right");
        for(int i : nums){
            System.out.println(i);
        }
    }

    static void rotateArr(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k -1);
        reverse(nums, k, nums.length - 1);
    }

    static void rotateDir(int[] nums, int k, String direction){
        k %= nums.length;
        direction = direction.toLowerCase();
        if(direction.equals("right")|| direction.equals("left")){
            if(direction.equals("right")){
                reverse(nums, 0, nums.length - 1);
                reverse(nums, 0, k -1);
                reverse(nums, k, nums.length - 1);
            } else {
                reverse(nums, 0, nums.length - 1);
                reverse(nums, k + 1, nums.length - 1);
                reverse(nums, 0, k);
            }
        } else System.out.println("Invalid input. Please choose between 'left' or 'right'");
    }

    static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
