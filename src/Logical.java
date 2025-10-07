public class Logical {
    public static void main(String[] args) {
        int x,y;
        x = 10;
        y = 20;
        String name = "John";
        boolean result = x<y && y>x;
        System.out.println(result);  // false
        System.out.println(x > y);  // false
        System.out.println(!result);
        System.out.println(name.equals("John"));
        
    }
}
