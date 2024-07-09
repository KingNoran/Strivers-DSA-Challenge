public class bubble {
    public static void main(String[] args) {
        int[] arr = {5,1,4,2,9,8};
        bubbleSort(arr, arr.length, 0);
        for(int i:arr){
            System.out.println(i);
        }
    } 
    
    static void bubbleSort(int[] arr, int len, int count){
        /* for(int i = 0, l = arr.length; i < l; i++){
            for(int j = i + 1; j < l; j++){
                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        Above is the non-recursive way */

        // What bubble sort needs: current index, next index, length, arr

        //Set base case
        if(count + 1 >= len){
            return;
        }
        // Set loop
        int i = count;
        while(i + 1 < len){
            int j = i + 1;
            if(arr[i] > arr[j]){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            i++;
        }
        // Recurse
        bubbleSort(arr, --len, ++count);
    }
}
