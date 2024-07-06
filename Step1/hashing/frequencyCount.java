import java.util.HashMap;

public class frequencyCount{
    public static void main(String[] args) {
        int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
        hash(arr);
    }

    static void hash(int arr[]){
        // Task: Print the frequences of an element in an array
        // ....
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr.length; i++){
            Integer count = hash.get(arr[i]);

            if(hash.get(arr[i]) == null) hash.put(arr[i], 1);
            else hash.put(arr[i], ++count);
        }
        hash.forEach((key,value) -> {
            String output = String.format("%d appeared exactly %d time(s)", key, value);
            System.out.println(output);
        });
    }
}