import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class divisor{
    public static void main(String[] args) {
        int number = 1000;
        List<Integer> array = divisors(number);
        for(int divisors : array){
            System.out.print(divisors + " ");
        };
        System.out.println();
    }

   /*  public static int[] divisors(int n, int[] size){
        int answer[] = new int[n];
        int count = 0;       
        for(int i = 1; i < n/2+1; i++){
            if(n % i == 0){
                answer[count++] = i;
            }
        }
        answer[count] = n;
        size[0] = count + 1;
        return answer;
    } */

    /* Above is the possible way. here is an attempt for better */

    public static List<Integer> divisors(int n){
        List<Integer> answer = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);

        for(int i = 1; i <= sqrt; ++i){
            if(n % i == 0){
                answer.add(i);
                if(i != n / i){
                    answer.add(n / i);
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }
}