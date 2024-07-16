package easy;

public class find {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(XOR(arr));
    }   
    static int XOR(int[] nums){
        int N = nums.length; // Length of the array (also the range of numbers is from 0 to N)
        int xor = 0;

        // XOR all indices and elements in nums
        for (int i = 0; i < N; i++) {
            xor ^= i ^ nums[i];
        }

        // Finally XOR with N (because range is 0 to N, and we have only XORed with 0 to N-1 so far)
        xor ^= N;

        // The result is the missing number
        return xor;
    }
}
