package com.javacourse.examples.elevator;

public class Elevator {
    public boolean doorOpen; // Values: "true" or "false"
    public int currentLevel;
    public int maxLevel;
    public int minLevel;

    //TODO: What to do if the building has limited number of levels?

    public void goUp() {
        if (currentLevel != maxLevel) {
            System.out.println("Going up....");
            if (!doorOpen) {
                currentLevel = currentLevel + 1;
            } else {
                System.out.println("Hey Kayne West, I mean, genius, please close the dooooooooor");
                System.out.println("You're in level " + currentLevel);
            }
        } else {
            System.out.println("You're at the top");
        }
    }
    public void goDown(){
        if(currentLevel == minLevel){
            System.out.println("You're at the bottom");
        }else{
        System.out.println("Going down....");
        if(!doorOpen) { //TODO: Apply good practices this. Follow what we did on line 9
            currentLevel = currentLevel - 1;
        }
        System.out.println("You're in level " + currentLevel);
    }}

    public void openDoor(){
        System.out.println("Opening door....");
        doorOpen = true;
        System.out.println("The door is open");
    }

    public void closeDoor(){
        System.out.println("Closing door....");
        doorOpen = false;
        System.out.println("The door is close");
    }
}
