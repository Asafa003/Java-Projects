public interface Shapes {
    double PI = 3.14; // Constant

    void draw();
    default void areaOfCircle(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of the circle: " + area);
       
    }
}
