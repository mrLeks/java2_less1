package com.company;

public class Robot implements Action {

    private String name;
    private int runDistance;
    private int jumpHeight;
    protected int runLimit;
    protected int jumpLimit;

    public Robot(String name, int distance, int height){
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = height;
        this.runLimit = 50;
        this.jumpLimit = 3;
    }

    @Override
    public void run() {
        System.out.printf("Robot" + this.name + "is running" + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.printf("Robot" + this.name + "is jumping" + this.getJumpHeight());
    }

    @Override
    public int getRunDistance(){
        return this.runDistance;
    }

    @Override
    public int getJumpHeight(){
        return this.getJumpHeight();
    }

}

