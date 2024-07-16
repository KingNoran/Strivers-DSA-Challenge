import java.util.ArrayList;

public class union{
    public static void main(String[] args) {
        int[] arr1 = {-8, -3, -3, -2, 0, 1, 2, 2, 6};
        int[] arr2 = {-9, -9, 0};
        for(int i : findUnion(arr1, arr2)){
            System.out.println(i);
        }
    }
    static ArrayList<Integer> findUnion(int[] arr1, int[] arr2){
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr1.length;
        int m = arr2.length;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
              if (arr.size() == 0 || arr.get(arr.size()-1) != arr1[i]) arr.add(arr1[i]);
              i++;
            } else // case 3
            {
              if (arr.size() == 0 || arr.get(arr.size()-1) != arr2[j]) arr.add(arr2[j]);
              j++;
            }
          }
          while (i < n) // IF any element left in arr1
          {
            if (arr.get(arr.size()-1) != arr1[i]) arr.add(arr1[i]);
            i++;
          }
          while (j < m) // If any elements left in arr2
          {
            if (arr.get(arr.size()-1) != arr2[j]) arr.add(arr2[j]);
            j++;
          }
          return arr;
    }
}