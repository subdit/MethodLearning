package com.ClassProject;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car porsche = new Car();
        bmw.setModel("535xi");
        System.out.println("Model is : " + porsche.getModel());
        porsche.setModel("Carrera");

        System.out.println("Model is : " + porsche.getModel());
        System.out.println("BMW model is : " + bmw.getModel());
    }
}
