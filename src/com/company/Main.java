package com.company;

public class Main {
    public static void main(String[] args)
    {


        Vehicle car= new Vehicle.VehicleBuilder("2000cc",4).setAirbags(4).build();

        Vehicle bike= new Vehicle.VehicleBuilder("200cc",2).build();

        System.out.println();
        System.out.println("For car the values of engine, wheel and airbags are: ");
        System.out.println(car.getEngine());
        System.out.println(car.getWheel());
        System.out.println(car.getAirbags());

        System.out.println();
        System.out.println("For bike the values of engine, wheel and airbags are: ");
        System.out.println(bike.getEngine());
        System.out.println(bike.getWheel());
        System.out.println(bike.getAirbags());
    }
}