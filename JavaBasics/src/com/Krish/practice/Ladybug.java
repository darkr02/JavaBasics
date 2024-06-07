package com.Krish.practice;

public class Ladybug {
    private String color;
    public Ladybug(){
        this("red");
    }
    public Ladybug(String color) {
        color = color;
    }
    public static void main(String[] args) {
        Ladybug myLady = new Ladybug();
        System.out.println("Color: " + myLady.color);
    }
}