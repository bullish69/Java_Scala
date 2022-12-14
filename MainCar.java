class Car {
    String brand;

    Car(String brand) {
        this.brand = "Audi";
    }

    void getbrand() {
        System.out.println("Brand is :- " + brand);
    }
}

public class MainCar {
    public static void main(String[] args) {
        Car c = new Car("");
        c.brand = "Ford";
        c.getbrand();
    }
}
