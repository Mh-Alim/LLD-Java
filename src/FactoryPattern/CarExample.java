package FactoryPattern;


interface Car {
    void drive();
}

class ElectricCar implements Car {
    @Override
    public void drive() {
        System.out.println("ElectricCar drive");
    }
}

class PetrolCar implements Car {
    @Override
    public void drive() {
        System.out.println("PetrolCar drive");
    }
}

enum CarType {
    ELECTRIC_CAR,
    PETROL_CAR
}
class CarFactory {
    public static Car createCar(CarType type) throws Exception {
        if(type == CarType.ELECTRIC_CAR){
            return new ElectricCar();
        }
        else if(type == CarType.PETROL_CAR){
            return new PetrolCar();
        }
        else throw new Exception("Unknow type of car");
    }
}
public class CarExample {
    public static void main(String[] args) throws Exception {
        /*
        ElectricCar electricCar = new ElectricCar();
        PetrolCar petrolCar = new PetrolCar();
        electricCar.drive();
        petrolCar.drive();
         */

        ElectricCar electricCar = (ElectricCar) CarFactory.createCar(CarType.ELECTRIC_CAR);
        electricCar.drive();
        PetrolCar petrolCar = (PetrolCar) CarFactory.createCar(CarType.PETROL_CAR);
        petrolCar.drive();
    }
}
