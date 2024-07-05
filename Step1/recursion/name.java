public class name {
    public static void main(String[] args) {
        printName("ken", 1, 3);
    }

    static void printName(String name, int start, int limit){
        if(start > limit) return;
        System.out.println(name);
        printName(name, start + 1, limit);
    }
}
