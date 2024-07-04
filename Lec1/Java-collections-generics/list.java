import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();

        values.add(3);
        values.add(99);
        values.add(77);
        values.add(2);
        values.add(88);

        Collections.sort(values);

        for(int i: values){
            System.out.println(i);
        }
    }
}
