import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class highlow {
    static HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

    // Task: Determine the elements with the highest and lowest frequency before printing them.
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        setHash(arr);
        printEnds(hash);
    }

    // Method for hashing
    static void setHash(int arr[]){   
        for(int i = 0; i < arr.length; i++){
            Integer count = hash.get(arr[i]);
            if(hash.get(arr[i]) == null) hash.put(arr[i], 1);
            else hash.put(arr[i], ++count);
        }
    }

    // Method for searching and printing
    static void printEnds(HashMap<Integer, Integer> hash){
        // Declare an array for highest and an array for lowest
        int highest[] = new int[2];
        int lowest[] = new int[2];
        // Access the keys using a list
        List<Integer> keys = new ArrayList<>(hash.keySet());
        // Go through the list and compare
        for(int i = 0; i < keys.size(); i++){
            int key = keys.get(i);
            int value = hash.get(keys.get(i));
            // At the start when the arrays are empty, fill both with the first element and its value
            if(i == 0){
                highest[0] = key;
                highest[1] = value;
                lowest[0] = key;
                lowest[1] = value;
                continue; // continue so it doesn't waste time
            }
            // Gets highest
            if(highest[1] < value){
                highest[0] = key;
                highest[1] = value;
                continue;
            }
            // Gets lowest
            if(lowest[1] > value){
                lowest[0] = key;
                lowest[1] = value;
            }
        }
        // Print them
        String highestOutput = String.format("Highest is %d with frequency of %d", highest[0], highest[1]);
        System.out.printf(highestOutput);
        String lowestOutput = String.format("Lowest is %d with frequency of %d", lowest[0], lowest[1]);
        System.out.println(lowestOutput);
    }
}
