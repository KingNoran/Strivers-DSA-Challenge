package easy;
import java.util.Arrays;
import java.util.List;

public class second {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(new Integer[]{1,2,3,4,5,50,6,7,8,9});
        System.out.println(findSecond(arr));
    }    

    static int findSecond(List<Integer> arr){
        int largest = 0;
        int second = 0;
        for(int i = 0 ; i < arr.size() ; i++){
            if(largest < arr.get(i)){
                second = largest;
                largest = arr.get(i);
                continue;
            }
            if(arr.get(i) > second && arr.get(i) != largest){
                second = arr.get(i);
            }
        }
        if(second == 0) return -1;
        return second;
    }
}
