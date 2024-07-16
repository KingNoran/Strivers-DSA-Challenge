package easy;
public class highest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,50,6,7,8,9};
        System.out.println(findHigh(arr));
    }

    static int findHigh(int[] arr){
        int x = 0;
        int y = 0;
        for(int i = 0, mid = arr.length/2, j = arr.length - 1;
            i <= mid && j >= mid;
            i++, j--){
            if(arr[i] > x){
                x = arr[i];
            }
            if(arr[j] > y){
                y = arr[j];
            }
        }
        if(x >= y) return x;
        else return y;
    }
}
