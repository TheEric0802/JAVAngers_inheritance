package org.example;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Honda", "Civic", 2022);
        Car car = new Car("Honda", "Civic", 2022, 4);
        System.out.println(vehicle.getInformation());
        System.out.println(car.getInformation());
    }
}