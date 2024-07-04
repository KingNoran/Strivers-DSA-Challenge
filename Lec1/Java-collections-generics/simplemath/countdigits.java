public class countdigits {
    public static void main(String[] args) { /* String method??? */
        int n = 329823;
        String a = String.valueOf(n);
        System.out.println("The number has " + a.length() + " digits");
    }

    /* Proper Method below */

    static int countDigits(int n) {

        int cnt = (int) (Math.log10(n) + 1); //Returns the highest placevalue - 1
        return cnt;
    }
}
