class Geometry {

    void area(int side) {
        System.out.println("Square Area = " + (side * side));
    }

    void area(int length, int width) {
        System.out.println("Rectangle Area = " + (length * width));

    }

    void area(double radius) {
        System.out.println("Circle Area = " + (3.14 * radius * radius));
    }
}

public class Geometry {
    public static void main(String[] args) {

        Area a = new Area();

        a.area(4);        
        a.area(5, 3);     
        a.area(2.5);      
    }
}
