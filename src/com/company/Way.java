package com.company;

public class Way {
    private int length;
    private String name;

    public Way(String name, int length){
        this.name = name;
        this.length = length;
    }

    public int getLength(){ return length; }

    public boolean move(Action action){

        action.run();
        if(getLength() < action.getRunDistance()){
            System.out.printf("Run");
            return true;
        } else {
            System.out.printf("dont run");
            return false;
        }
    }
}
