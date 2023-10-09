package org.example;

public class Main {
    public static void main(String[] args) {

        RemoteControl remoteControl = RemoteControl.getInstance();
        remoteControl.turnOn();
        remoteControl.turnOff();

    }
}