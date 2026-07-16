package src.com.wipro.automobile.ship;

public class Compartment {
    
    private double height;
    private double width;
    private double breadth;

    public Compartment(double h, double w, double b) {
        height = h;
        width = w;
        breadth = b;
    }

    public void display() {

        System.out.println("Height : " + height);
        System.out.println("Width  : " + width);
        System.out.println("Breadth: " + breadth);
    }
}
