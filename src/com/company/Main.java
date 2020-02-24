package com.company;

public class Main {

    public static void main(String[] args) {
        Action[] action = new Action[5];

        action[0] = new Human("Volodya", 50, 1);
        action[1] = new Human("Aleksandr", 35,2);
        action[2] = new Cat("Barsik", 30,3);
        action[3] = new Robot("Bender", 10, 2);
        action[4] = new Robot("Boston", 5,1);
        
        System.out.printf();
    }
}
