import java.util.ArrayList;

public class merge {
    public static void main(String[] args) {
        int[] arr = {3,2,8,5,1,4,23};
        mergeSort(arr, 0, arr.length - 1);
        for(int i:arr){
            System.out.println(i);
        }
    }

    // Using Merge sort, merge the array passed inside the method
        // Merge Sort specifications:
        // Divide the array by 2 continuously until the array size is "1"
        // When array size is "1", start to compare and sort
    static void mergeSort(int[] arr, int low, int high){
        // If low and high meet each other, return
        if(low >= high) return;
        // Initialize middle var
        int mid = (low + high) / 2;
        // Get left array
        mergeSort(arr, low, mid);
        // Get right array
        mergeSort(arr, mid + 1, high);
        // Call merge method
        merged(arr, low, mid, high);
    }

    static void merged(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid + 1;
        // Loop the array until every element has been added
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        // Loops again to make sure everyhing is there
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        // Loops again to make sure everything is there
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        // Transfer the elements to the array
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }
}   
    
    