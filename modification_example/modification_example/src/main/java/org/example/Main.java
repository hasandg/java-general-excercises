package org.example;

public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();
        Car car = new Car();
        car.setName("name1");
        car.setTireCount(4);
        garage.setCar1(car);

        car.setName("name2");
        car.setTireCount(6);
        garage.setCar2(car);




        System.out.printf(garage.toString());


    }
}