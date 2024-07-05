public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        reverseArr(arr);
        for(int i : arr) System.out.println(i);
    }

    static int[] reverseArr(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int placeholder = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = placeholder;
        }
        return arr;
    }
}
