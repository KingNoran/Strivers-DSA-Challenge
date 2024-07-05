public class palindromeNum {
    // Task: Check if the number is a palindrome or not.

    /*
     * Example: 
     * 121 is a palindrome (121 backwards)
     * -121 is NOT a palindrome (121- backwards)
     * 10 is NOT a palindrome (01 backwards)
    */
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    
    public static boolean isPalindrome(int x){
        if(x < 0) return false;
        int reversed  = 0;
        int original = x;
        while(x > 0){
            int digit = x % 10;
            reversed = (reversed * 10) + digit;
            x = x/10;
        }
        if(reversed == original) return true;
        return false;
    }
}
