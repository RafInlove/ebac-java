package com.ebac.carfactory;

public class CarFactorySimulation {
    private CarFactory carFactory;

    public CarFactorySimulation(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public void assembleCar() {
        Car car = carFactory.createCar();
        car.assemble();
    }

    public static void main(String[] args) {
        CarFactory luxuryCarFactory = new LuxuryCarFactory();
        CarFactory sportsCarFactory = new SportsCarFactory();

        CarFactorySimulation luxurySimulation = new CarFactorySimulation(luxuryCarFactory);
        CarFactorySimulation sportsSimulation = new CarFactorySimulation(sportsCarFactory);

        System.out.println("Fábrica de carros de luxo:");
        luxurySimulation.assembleCar();

        System.out.println("\nFábrica de carros sport:");
        sportsSimulation.assembleCar();
    }
}
