public class CarModel extends ClassObj {
    private String color;
    private String country;

    public CarModel(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    // Overloaded method
    public CarModel(String brand, String model, int year, String color, String country) {
        super(brand, model, year);
        this.color = color;
        this.country = country;
    }

    void start() {
        System.out.println("The car started");
    }

    void start(Boolean keyType) {
        if (keyType) {
            System.out.println("The car started with a " + keyType + " key");  
        }
        else {
            System.out.println("The car started with a regular key");
        }
    }

    public static void main(String[] args) {
        CarModel myCar = new CarModel("Benz", "GLE 450", 2024, "Black");
        System.out.println(myCar.brand + " " + myCar.model + " " + myCar.year + " " + myCar.color);

        CarModel myNewCar = new CarModel("BMW", "X5", 2024, "White", "Germany");
        System.out.println(myNewCar.brand + " " + myNewCar.model + " " + myNewCar.year + " " + myNewCar.color + " " + myNewCar.country);
        myCar.start();
        myCar.start(true);
        myCar.honk();
        myCar.park();
    }

}
