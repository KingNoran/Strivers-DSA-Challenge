import java.util.*;

public class comparator {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        values.add(305);
        values.add(998);
        values.add(774);
        values.add(236);
        values.add(881);

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2){
                if(o1%100>o2%100)
                    return 1;
                
                return -1;
            }
        };

        Collections.sort(values, com);

        values.forEach(System.out::println);
    }   
}
