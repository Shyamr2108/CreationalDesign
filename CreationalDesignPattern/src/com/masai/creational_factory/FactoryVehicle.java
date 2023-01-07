package com.masai.creational_factory;



public class FactoryVehicle {

    public static Vehicle getVehicle(String type,String model, String regNo, int makeYear, String[] specialFeatures){
        if("Bmw".equalsIgnoreCase(type)){
            return new Bmw(model,regNo,makeYear,specialFeatures);
        }
        if("Maruti".equalsIgnoreCase(type))
            return new Maruti(model,regNo,makeYear,specialFeatures);
        if("Tata".equalsIgnoreCase(type))
            return new Tata(model,regNo,makeYear,specialFeatures);

        return null;
    }

}
