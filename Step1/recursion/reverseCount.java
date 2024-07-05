public class reverseCount {
    public static void main(String[] args) {
        printReverse(10);
    }
    
    static void printReverse(int start){
        if(start < 1) return;
        System.out.println(start);
        printReverse(start - 1);
    }
}
