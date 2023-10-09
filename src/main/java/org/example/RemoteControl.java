package org.example;

public class RemoteControl {
    private static RemoteControl instance;

    private RemoteControl() {
    }

    public static RemoteControl getInstance() {
        if (instance == null) {
            instance = new RemoteControl();
        }
        return instance;
    }

    public void turnOn() {
        System.out.println("Remote Control: Turning On");
    }

    public void turnOff() {
        System.out.println("Remote Control: Turning Off");
    }

}
