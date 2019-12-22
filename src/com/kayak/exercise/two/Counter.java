package com.kayak.exercise.two;

public class Counter {

    private int loopCounter;

    public Counter(){
        this.loopCounter = 0;
    }

    public void countUp(int start, int end){
        if(this.loopCounter == 0 && (start > end)) throw new IllegalArgumentException("Start must be less than end");
        if(start <= end){
            System.out.println(start);
            start++;
            this.loopCounter++;
            this.countUp(start, end);
        }
    }

    public void countUpAndDown(int start, int end){
        if(this.loopCounter == 0 && (start > end)) throw new IllegalArgumentException("Start must be less than end");
        if(this.loopCounter <= (end - start)) this.countUp(start, end);
        end--;
        if(start <= end){
            System.out.println(end);
            this.loopCounter++;
            this.countUpAndDown(start, end);
        }
    }

}
