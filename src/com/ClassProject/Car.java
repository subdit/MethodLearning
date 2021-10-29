package com.ClassProject;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Setter and we can do validation on setModel or serValue
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("911") || validModel.equals("535xi")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }
    }
    // Getter
    public String getModel(){

        return this.model;
    }
}
