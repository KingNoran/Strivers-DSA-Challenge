import java.util.regex.Pattern;

public class isPalindromeStr {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0,"ab_a"));
        
    }

    /* static boolean isPalindrome(String s){ <---- This is the non-recursive method
        Pattern regex = Pattern.compile("[^a-zA-z0-9]");
        
        s = regex.matcher(s).replaceAll("");
        System.out.println(s);
        for(int i = 0, length = s.length(); i < length / 2; i++){
            if(s.charAt(i) != s.charAt(length - 1 - i)){
                return false;
            }
        }
        return true;
    } */

    static boolean isPalindrome(int i, String s){
        Pattern regex = Pattern.compile("[^\\p{Alnum}]+");
        s = regex.matcher(s).replaceAll("");
        s = s.toLowerCase();
        int length = s.length();
        if(i >= length/2) return true;

        if(s.charAt(i) != s.charAt(length - i - 1)) return false;

        return isPalindrome(i+1, s);
    }
}
