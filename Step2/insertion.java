public class insertion {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};        
        insertionSort(arr, arr.length, 0);
        for(int i : arr){
            System.out.println(i);
        }
    }

    static void insertionSort(int[] arr, int len, int sor){
        // Insertion Sort needs: Sorted index, Unsorted index
        // Go through the sorted list until the current variable is in its proper place


        /* for(int i = 0, l = arr.length; i < l && i+1 < l; i++){ // i = sorted index
            if(arr[i] > arr[i+1]){
                for(int cur = i + 1, nxt = i; nxt >= 0; nxt--, cur--){ // j = unsorted index
                    if(arr[nxt] > arr[cur]){
                        int tmp = arr[cur];
                        arr[cur] = arr[nxt];
                        arr[nxt] = tmp;
                    }
                }
            }
        } Above is non-recursive */
        
        // What Insertion Sort needs: arr, length, sorted index

        // Set base case
        if(sor + 1 >= len){
            return;
        }

        // Set loop
        if(arr[sor] > arr[sor+1]){
            for(int cur = sor + 1, nxt = sor; nxt >= 0; nxt--, cur--){
                if(arr[nxt] > arr[cur]){
                    int tmp = arr[cur];
                    arr[cur] = arr[nxt];
                    arr[nxt] = tmp;
                }
            }
        }
        
        // Recurse
        insertionSort(arr, len, sor + 1);
    }
}
