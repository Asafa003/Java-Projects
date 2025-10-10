public class Circle implements Shapes {
    // Circle class inherits from Shapes class
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    
    
    

    public static void main(String[] args) {
        
        Circle myCircle = new Circle(5.0);
        myCircle.draw();  // Calls the overridden method
        double area = Shapes.PI * myCircle.radius * myCircle.radius;
        System.out.println("Area of the circle: " + area);
        myCircle.areaOfCircle(myCircle.radius); // Calls the default method from Shapes interface
        
    }
}
