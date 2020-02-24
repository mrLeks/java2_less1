package com.company;

public class Wall {

    private int height;
    private String name;

    public Wall(String name, int height){
        this.name = name;
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public boolean move(Action action){

        action.jump();
        if(getHeight() < action.getRunDistance()){
            System.out.printf("Jump");
            return true;
        } else {
            System.out.printf("dont jump");
            return false;
        }
    }
}
