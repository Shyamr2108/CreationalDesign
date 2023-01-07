package com.masai.creational_factory;

import java.util.Arrays;

public class Main {

    public static void main(String args[]){

        String[] specialf=new String[2];
        specialf[0]="Auto";
        specialf[1]="1000cc";

        Vehicle vehicle1 =FactoryVehicle.getVehicle("Tata","Tata_nexon","rs123",2005,specialf);
        Vehicle vehicle2 =FactoryVehicle.getVehicle("Bmw","Bmw_s22","rs999",2015,specialf);

        System.out.println(vehicle1.getModel());
        System.out.println(Arrays.toString(vehicle2.getSpecialFeature()));
        System.out.println(vehicle1.getMakeYear()+" ----- vehicle2"+ vehicle2.getMakeYear());
        System.out.println(vehicle2);
    }
}
