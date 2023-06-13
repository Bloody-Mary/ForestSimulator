package ru.babushkina.week3.task2;

public class CarConstruction {

    String brand;
    String color;
    String speed;
    String stop;

    public CarConstruction(){

    }

    public CarConstruction(String brand, String color, String speed, String stop){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.stop = stop;
    }

    public static void main(String[] args){
        CarConstruction car1 = new CarConstruction("Honda", "зелёная", "быстро", "не тормозит");

        CarConstruction car2 = new CarConstruction();
        car2.brand = "Audi";
        car2.color = "красная";
        car2.speed = "медленно";
        car2.stop = "тормозит";

        System.out.println("Машина: " + car1.brand + " " + car1.color + ".");
        System.out.println("Машина: " + car2.brand + " " + car2.color + ".");
    }
}
