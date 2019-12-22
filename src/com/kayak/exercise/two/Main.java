package com.kayak.exercise.two;

public class Main {

    public static void main(String[] args) {
        System.out.println("Part 1:");
        Counter counterUp = new Counter();
        counterUp.countUp(0,5);
        System.out.println("Part 2:");
        Counter counterUpAndDown = new Counter();
        counterUpAndDown.countUpAndDown(0,5);
    }
}
