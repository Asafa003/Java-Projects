public class Encaps {
    
    public static void main(String[] args) {
        ClassObj myCar = new ClassObj("Toyota", "Corolla", 2020);
        System.out.println(myCar.brand + " " + myCar.model + " " + myCar.year);
        myCar.start();
        myCar.honk();
        myCar.park();
    }

}
