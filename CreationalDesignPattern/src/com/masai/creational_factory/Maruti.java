package com.masai.creational_factory;

public class Maruti extends Vehicle{

    private String model;
    private String regNo;
    private int makeYear;
    private String[] specialFeatures;

    public Maruti(String model, String regNo, int makeYear, String[] specialFeatures) {
        this.model = model;
        this.regNo = regNo;
        this.makeYear = makeYear;
        this.specialFeatures = specialFeatures;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getMakeYear() {
        return makeYear;
    }

    @Override
    public String getRegNo() {
        return regNo;
    }

    @Override
    public String[] getSpecialFeature() {
        return specialFeatures;
    }
}
