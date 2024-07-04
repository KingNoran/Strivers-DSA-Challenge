public class gcdlcm {
    public static void main(String[] args) {
        int x = 9;
        int y = 12;
        System.out.println("The GCD of " + x + " and " + y + " is " + GcdLcm(x, y));
    }

    public static int GcdLcm(int A, int B)
    {
        /* int answer[] = new int[2];
        int placeholderx = Math.max(A,B);
        int placeholdery = Math.min(A,B);
        int lcm;
        // Find the LCM
        while(true){
            if(placeholderx != placeholdery){
                placeholdery += Math.min(A,B);
                    if(placeholderx < placeholdery){
                        placeholderx += Math.max(A,B);
                    }
            } else {
                lcm = placeholdery;
                break;
            }
        }
        // Print LCM
        System.out.println("The LCM of " + A + " and " + B + " is " + lcm);
        // Calculate GCD before returning it
        int GCD = (int) (A*B)/lcm;
        return GCD; */

        /* Above is one way of doing it. Here's an attempt for better */

        while(A > 0 && B > 0){
            if(A > B) A %= B;
            else B %= A;
        }

        if(A == 0) return B;
        return A;
    }
}
