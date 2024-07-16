import java.util.HashMap;
import java.util.Map;

public class longSubGivenK {
    public static void main(String[] args) {
        int[] arr = {-16, -12, -6, 5, -12, -3, 2, 18, 12, -11, -15, -15, 15, 12, -1, -14, -6, 1, 12, 1};
        System.out.println(lenOfLongSubarr(arr, arr.length, 9));
    }
    static int lenOfLongSubarr (int[] A, int N, int K) {
        //Complete the function
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int highest = 0;
        for (int i = 0; i < N; i++) {
            //calculate the prefix sum till index i:
            sum += A[i];

            // if the sum = k, update the highest:
            if (sum == K) {
                highest = Math.max(highest, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - K;

            //Calculate the length and update highest:
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                highest = Math.max(highest, len);
            }

            //Finally, update the map checking the conditions:
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return highest;
    }
}
