import java.util.ArrayList;
import java.util.Collections;

public class leaders {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        for(int i : findLeaders(arr.length, arr)) System.out.println(i);;
    }   
    
    static ArrayList<Integer> findLeaders(int n, int arr[]) {
        // Your code here
        int j = n - 2; // arr pointer
        ArrayList<Integer> ans = new ArrayList<>(); // leader arr
        ans.add(arr[j+1]);
        int i = 0; // ans pointer
        while(j >= 0){ // loop the array from the right
            if(arr[j] >= ans.get(i)){ // if current element is greater than leader, add and make leader
                ans.add(arr[j]);
                i++;
            }
            j--;
        }
        Collections.reverse(ans);
        return ans;
    }
}
