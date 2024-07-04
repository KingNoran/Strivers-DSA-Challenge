public class armstrong {
    public static void main(String[] args) {
        System.out.println(aStrong(153));
        System.out.println(aStrong(371));
        System.out.println(aStrong(111));
    }

    public static boolean aStrong(int n){
        /*
         * Problem Statement: 
         * Given an integer N, return true it is an Armstrong number otherwise return false.
         * An Amrstrong number is a number that is equal to the sum of its 
         * own digits each raised to the power of the number of digits.
         * 
         * Examples:
         * 153 is an armstrong number.
         * Length = 3 
         * 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
         * 
         * 371 is an armstrong number.
         * Length = 3
         * 3^3 + 5^3 + 1^3 = 27 +  343 + 1 = 371
         */
        int length = String.valueOf(n).length();
        int orig = n;
        int armstrong = 0;
        while(n > 0){
            armstrong += Math.pow(n % 10, length);
            n /= 10;
        }
        return orig == armstrong ? true : false;
    }
}
