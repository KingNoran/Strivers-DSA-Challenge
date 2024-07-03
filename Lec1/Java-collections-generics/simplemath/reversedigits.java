public class reversedigits {


    //Instructions: Reverse the number.
    // Example: 89002 to 20098

    //If the number ends in "0" 
    //(e.g. 59000) it should exclude the zero (e.g. 95 instead of 00095)

    static void reversify(int n){
        /* int reversed = 0;
        int count = (int) Math.log10(n);
        while(n > 0){
            int digit = n % 10;
            int placevalue = (int) Math.pow(10, count);
            reversed += digit * placevalue;
            count--;
            n /= 10;
        }
        System.out.println(reversed); */


        /*My Method is above. Optimal Method below*/
        
        int revNum = 0;
        // Start a while loop to reverse the
        // digits of the input integer.
        while(n > 0){
            // Extract the last digit of
            // 'n' and store it in 'ld'.
            int ld = n % 10;
            // Multiply the current reverse number
            // by 10 and add the last digit.
            revNum = (revNum * 10) + ld;
            // Remove the last digit from 'n'.
            n = n / 10;
        }
        // Print the reversed number.
        System.out.println(revNum);
    }
    public static void main(String[] args) {
        reversify(123456789);
        reversify(895000);
    }
}
