public class factorial {
    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }   

    static int printFactorial(int n){
        if(n == 1){
            return n;
        }
        return n * printFactorial(n - 1);
    }   
}
