public class linear {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(searchInSorted(arr, arr.length, 5));   
    }   
    static int searchInSorted(int arr[], int N, int K)
    {
        int i = 0;
        // Your code here
        if(K > (N/2)){
            i = N - 1;
            while(i >= 0){
                if(arr[i] == K) return 1;
                i--;
            } return -1;
        } else {
            while(i < N){
                if(arr[i] == K) return 1;
                i++;
            } return -1;
        }
    }
}
