package com.masai.creational_factory;

import java.util.Arrays;

public abstract class Vehicle {
   public abstract  String getModel();
   public abstract int getMakeYear();
   public abstract String getRegNo();
   public abstract String[] getSpecialFeature();

    @Override
    public String toString() {
        return "Model:"+getModel() + ",Make Year: "+getMakeYear()+ ",RegNumber: "+ getRegNo()+",Special Features "+ Arrays.toString(getSpecialFeature());
    }
}
