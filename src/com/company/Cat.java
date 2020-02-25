package com.company;

    public class Cat implements Action{

        private String name;
        private int runDistance;
        private int jumpHeight;

        public Cat(String name, int distance, int height){
            this.name = name;
            this.runDistance = distance;
            this.jumpHeight = height;
        }

        @Override
        public void run() { System.out.printf("Cat" + this.name + "is running" + this.getRunDistance()); }
        @Override
        public void jump() { System.out.printf("Cat" + this.name + "is jumping" + this.getJumpHeight()); }
        @Override
        public int getRunDistance(){ return this.runDistance;    }
        @Override
        public int getJumpHeight(){
            return this.getJumpHeight();
        }
        //test

    }
