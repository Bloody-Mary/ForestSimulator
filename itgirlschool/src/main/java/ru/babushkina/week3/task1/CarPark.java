package ru.babushkina.week3.task1;

public class CarPark {
    String color;
    String brand;

    public String speed(String speedType) {
        return "едет " + speedType;
    }

    public String stop() {
        return "тормозит";
    }

    public static void main(String[] args) {
        CarPark car1 = new CarPark();
        car1.color = "зелёный";
        car1.brand = "Honda";

        CarPark car2 = new CarPark();
        car2.color = "красный";
        car2.brand = "Mercedes";

        CarPark car3 = new CarPark();
        car3.color = "жёлтый";
        car3.brand = "Porsche";

        System.out.println("Машина " + car1.brand + " " + car1.speed("быстро") + ".");
        System.out.println("Машина " + car1.brand + " " + car1.stop() + ".");
        System.out.println("Машина " + car2.brand + " " + car2.speed("медленно") + ".");
        System.out.println("Машина " + car2.brand + " " + car2.stop() + ".");
        System.out.println("Машина " + car3.brand + " " + car3.speed("быстро") + ".");
        System.out.println("Машина " + car3.brand + " " + car3.stop() + ".");
    }
}