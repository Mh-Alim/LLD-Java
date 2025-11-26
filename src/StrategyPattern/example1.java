package StrategyPattern;


/*
class Vehicle {
    public void drive() {
        System.out.println("Driving Capability: Normal");
    }
}


class SportsVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving Capability: Sports");
    }
}

class OffRoadVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving Capability: Sports"); // Code Duplication.
    }
}

class PassangerVehicle extends Vehicle{
}


 */

interface DrivingStrategy {
    void drive();
}

class SportsDrivingStrategy implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("Driving Capability: Sports");
    }
}

class NormalDrivingStrategy implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("Driving Capability: Normal");
    }
}


class Vehicle {
    DrivingStrategy drivingStrategy;
    Vehicle(DrivingStrategy drivingStrategy){
        this.drivingStrategy = drivingStrategy;
    }

    public void drive(){
        drivingStrategy.drive();
    }
}

class SportsVehicle extends Vehicle{
    SportsVehicle(DrivingStrategy drivingStrategy){
        super(drivingStrategy);
    }
}

class NormalVehicle extends Vehicle{
    NormalVehicle(DrivingStrategy drivingStrategy){
        super(drivingStrategy);
    }
}

class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(DrivingStrategy drivingStrategy){
        super(drivingStrategy);
    }
}

public class example1 {
    public static void main(String[] args) {
        /*

        SportsVehicle sportsVehicle = new SportsVehicle();
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        PassangerVehicle passangerVehicle = new PassangerVehicle();
        sportsVehicle.drive();
        offRoadVehicle.drive();
        passangerVehicle.drive();

        */

        SportsVehicle sportsVehicle = new SportsVehicle(new SportsDrivingStrategy());
        sportsVehicle.drive();

        NormalVehicle normalVehicle = new NormalVehicle(new NormalDrivingStrategy());
        normalVehicle.drive();
    }
}
