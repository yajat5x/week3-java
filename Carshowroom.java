class Car {

    Car() {
        System.out.println("No Details");
    }

    Car(String model) {
        System.out.println("Model: " + model);
    }

    Car(String model, int price) {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Carshowroom {

    public static void main(String[] args) {

        new Car();
        new Car("Swift");
        new Car("Creta", 1500000);

    }
}
