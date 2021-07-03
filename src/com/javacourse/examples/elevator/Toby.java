package com.javacourse.examples.elevator;

public class Toby { //This is a class used to test another ones

    public static void main(String[] args) {

        Elevator myElevator = new Elevator();

        System.out.println("START -> Level " + myElevator.currentLevel + " | Door: " + myElevator.doorOpen);
        myElevator.openDoor();
        //myElevator.closeDoor();
        myElevator.goUp();
        //myElevator.goDown();
        System.out.println("FINISH: " + myElevator.currentLevel);

    }
}