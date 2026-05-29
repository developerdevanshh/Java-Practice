package com.dev.engineer.solid;

interface Engine {
    void start();
}
// Low-level module
class PetrolEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Petrol Engine Starts.");
    }
}

// Low-level module
class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Diesel Engine Starts.");
    }
}

// High-level module
class Car {

    private Engine engine;

    Car(Engine engine){
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car is driving.");
    }
}
public class D_Dependency_Inversion {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Car petrolCar = new Car(petrolEngine);
        petrolCar.drive();

        System.out.println();

        Engine dieselEngine = new DieselEngine();
        Car dieselCar = new Car(dieselEngine);
        dieselCar.drive();
    }
}
