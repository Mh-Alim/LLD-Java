package SOLID;

/* Dont follow Liskov Principle
interface Vehicle {
    void turnOnEngine();
    void turnOffEngine();
    void accelerate();
    void applyBreak();
}

class Bike implements Vehicle {
    @Override
    public void turnOffEngine() {
        System.out.println("Bike turned off");
    }

    @Override
    public void turnOnEngine() {
        System.out.println("Bike turned on");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike accelerated");
    }

    @Override
    public void applyBreak() {
        System.out.println("Bike applying break");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void turnOffEngine() {
        throw new Error("Bicycle don't have engine");
    }

    @Override
    public void turnOnEngine() {
        throw new Error("Bicycle don't have engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle accelerated");
    }

    @Override
    public void applyBreak() {
        System.out.println("Bicycle applying break");
    }
}

*/
// Following Liskov Principle
interface Engine {
    void turnOffEngine();
    void turnOnEngine();
}

interface Vehicle {
    void applyBreak();
    void accelerate();
}


class Bike implements Engine, Vehicle {

    @Override
    public void turnOnEngine() {
        System.out.println("Bike Engine Turned on");
    }
    @Override
    public void turnOffEngine() {
        System.out.println("Bike Engine Turned Off");
    }
    @Override
    public void applyBreak() {
        System.out.println("Applied Breaks to Bike");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerated Bike");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void applyBreak() {
        System.out.println("Applied Breaks to BiCycle");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerated BiCycle");
    }
}


public class LiskovSubstitutionPrinciple {
    public static void main(String []args) {
        Bike  bike = new Bike();
        Bicycle bicycle = new Bicycle();
        bike.turnOffEngine();
        bike.turnOffEngine();
        bike.accelerate();
        bike.applyBreak();

        // Voilets LSP principle since both child doesnt have same behaviour
//        bicycle.turnOffEngine();
//        bicycle.turnOffEngine();
        bicycle.accelerate();
        bicycle.applyBreak();

        // need to change classes little bit
    }
}
