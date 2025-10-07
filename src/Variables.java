public class Variables {
    public static void main(String[] args) {
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String
        double myDecimal = 15.50;   // Double precision floating point number
        int myPi = (int) myDecimal; // Casting double to int
        String myNew = String.valueOf(myNum); // Converting double to String

        System.out.println("Integer: " + myNum);
        System.out.println("Float: " + myFloatNum);
        System.out.println("Character: " + myLetter);
        System.out.println("Boolean: " + myBool);
        System.out.println("String: " + myText);
        System.out.println("Double: " + myDecimal);
        System.out.println("Casted Integer from Double: " + myPi);
        System.out.println("Converted String from Integer: " + myNew);
    }
}
