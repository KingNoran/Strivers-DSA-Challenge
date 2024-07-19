
public class nextPermut {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        nextPermutation(arr);
        for(int i : arr) System.out.println(i);;
    }

    static void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for(int i = n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }
        if (ind == -1){
            reverseArr(nums, 0, n-1);
            return;
        }
        for(int i = n-1; i > ind; i--){
            if(nums[i] > nums[ind]){
                swap(nums, ind, i);
                break;
            }
        }
        reverseArr(nums, ind + 1, n-1);
    }

    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void reverseArr(int[] arr, int start, int end){
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
