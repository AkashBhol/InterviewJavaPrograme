package wrapper;

public class Example {

    public static void main(String[] args) {
        int primitiveValue = 10;

        System.out.println("Before method call: " + primitiveValue);

        modifyPrimitive(primitiveValue);

        System.out.println("After method call: " + primitiveValue);

        // Using an object
        MutableObject mutableObject = new MutableObject(10);
        System.out.println("Before method call: " + mutableObject.getValue());

        modifyObject(mutableObject);

        System.out.println("After method call: " + mutableObject.getValue());
    }

    private static void modifyPrimitive(int value) {
        value = 20;
        System.out.println("Inside method: " + value);
    }

    private static void modifyObject(MutableObject obj) {
        obj.setValue(20);
        System.out.println("Inside method: " + obj.getValue());
    }
}

class MutableObject {
    private int value;

    public MutableObject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

