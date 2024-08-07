public class prime {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        for(int i = 0; i < arr.length; i++) System.out.println(isPrime(arr[i]));
        
    }

    public static boolean isPrime(int n){
        int sqrt = (int) Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++){
            if(n % i == 0 || n % (n/i) == 0) return false;
        }
        return true;
    }
}
