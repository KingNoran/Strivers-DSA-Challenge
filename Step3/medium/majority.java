import java.util.HashMap;

public class majority {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }   
    
    static int majorityElement(int[] nums) {
        int k = (int) Math.ceil((double)nums.length / 2);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if (map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);

            if(map.containsValue(k)) return i;
        }
        return 0;
    }

    /* public int majorityElement(int[] nums) {
        int count = 0;
        int lead = 0;

        for(int i : nums){
            if (count == 0){
                lead = i;
            }

            if (i == lead) count++;
            else count--;
        }
        return lead;
    } <-- This is the Optimal Answer*/
}
