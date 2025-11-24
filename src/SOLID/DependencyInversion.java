package SOLID;


import javax.crypto.Mac;

interface Keyboard {
    void getSpecifications();
}

class BluetoothKeyboard implements Keyboard {
    public final String modelName;
    public final Integer modelNumber;

    BluetoothKeyboard(String modelName, Integer modelNumber) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
    }

    @Override
    public void getSpecifications() {
        System.out.println("BluetoothKeyboard Model Number : " + this.modelNumber);
        System.out.println("BluetoothKeyboard Model Name : " + this.modelName);
    }
}

class WiredKeyboard implements Keyboard {
    public final String modelName;
    public final Integer modelNumber;
    WiredKeyboard(String modelName, Integer modelNumber) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
    }
    @Override
    public void getSpecifications() {
        System.out.println("WiredKeyboard Model Number : " + this.modelNumber);
        System.out.println("WiredKeyboard Model Name : " + this.modelName);
    }
}

// Macbook is tightly coupled with BluetoothKeyboard object.
class Macbook {
    public final BluetoothKeyboard bluetoothKeyboard;
    Macbook(BluetoothKeyboard bluetoothKeyboard) {
        this.bluetoothKeyboard = bluetoothKeyboard;
    }

    public void getKeyboard() {
        System.out.println("GetKeyboard");
    }
}


// dependency inversion.
class MacbookLooslyCoupled {
    public final Keyboard keyboard;
    MacbookLooslyCoupled(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void getKeyboard() {
        System.out.println("GetKeyboard");
    }
}
public class DependencyInversion {
    public static void main(String[] args) {

    }
}
