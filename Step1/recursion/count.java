public class count {
    public static void main(String[] args) {
        printCount(1, 3);
    }

    static void printCount(int start, int limit){
        if(start > limit) return;
        System.out.println(start);
        printCount(start + 1, limit);
    }
}
