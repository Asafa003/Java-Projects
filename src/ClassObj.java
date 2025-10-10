public class ClassObj {
    // Attributes
    String brand;
    String model;
    int year;
    static int totalCars;

    public ClassObj(String brand, String model, int year) {
        // Constructor
        this.brand = brand;
        this.model = model;
        this.year = year;
        totalCars++;
    }

    // Methods
    void start() {
        System.out.println("The car started");
    }

    void honk() {
        System.out.println("Beep beep!");
    }

    void park() {
        System.out.println("The car is parked");
    }

    static void total() {
        System.out.println(totalCars + " cars created.");
    }

    // Main method to test the class

    public static void main(String[] args) {
        ClassObj myCar = new ClassObj("Toyota", "Corolla", 2020);
        System.out.println(myCar.brand + " " + myCar.model + " " + myCar.year);
        myCar.start();
        myCar.honk();
        myCar.park();

        total();
    }

}
