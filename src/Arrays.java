public class Arrays {
    public static void main(String[] args) {
        //int[] myNum = {10, 20, 30, 40};
        int[] myNum = new int[5];
        myNum[0] = 10;
        myNum[1] = 20;
        myNum[2] = 30;
        myNum[3] = 40;
        myNum[4] = 50;
        System.out.println(myNum[4]);

        String[] names = {"John", "Jane", "Jack", "Doe"};
        String name = names[3];
        System.out.println(name);
    }
}
