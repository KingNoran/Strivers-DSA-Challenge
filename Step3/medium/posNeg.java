public class posNeg {
    public static void main(String[] args) {
        for(int i : rearrangeArray(new int[]{3,1,-2,-5,2,-4})) 
            System.out.println(i);
    }

    static int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int[] ans = new int[nums.length];
        for(int i : nums){
            if(i < 0){
                ans[neg] = i;
                neg+=2;
            } else {
                ans[pos] = i;
                pos+=2;
            }
        }
        return ans;
    }
}
