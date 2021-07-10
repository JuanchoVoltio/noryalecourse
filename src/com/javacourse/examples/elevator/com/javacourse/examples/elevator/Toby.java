package com.javacourse.examples.elevator;

public class Toby { //This is a class used to test another ones

    public static void main(String[] args) {

        Elevator myElevator = new Elevator();
        Elevator[] myBuilding = {myElevator, new Elevator(), new Elevator(), new Elevator()};
        myElevator.currentLevel = 10;
        myBuilding[1].currentLevel = 1;
        myBuilding[2].currentLevel = 4;
        myBuilding[3].currentLevel = 8;

        for(Elevator currentOne : myBuilding){
            System.out.println("START -> Level " + currentOne.currentLevel + " | Door: " + currentOne.doorOpen);
            currentOne.openDoor();
            currentOne.closeDoor();
            currentOne.goUp();
            //myElevator.goDown();
            System.out.println("FINISH: " + currentOne.currentLevel);
            System.out.println("------------------------------------------");
        }


    }
}
