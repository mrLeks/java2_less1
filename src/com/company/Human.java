package com.company;

public class Human implements Action {

    private String name;
    private int runDistance;
    private int jumpHeight;

    public Human(String name, int distance, int height) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = height;
    }

    @Override
    public void run() {
        System.out.printf("Human" + this.name + "is jumping" + this.getJumpHeight());
    }

    @Override
    public void jump() {
        System.out.printf("Human" + this.name + "is jumping" + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.getJumpHeight();
    }

}

