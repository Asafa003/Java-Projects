public class Method {
    public static void main(String[] args) {
        String name = "Alice";
        System.out.println(name.length());
        printName("Demscript", 2);
        System.out.println(printInts(5));
    }

    public static void printName(String name, int n) {
        for (int i = 0; i < n; i++)
        System.out.println(name);
    }

    public static int printInts(int num) {
        return num * 2;
    }
}
