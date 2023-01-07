package com.masai.creational_factory;

public class Tata extends Vehicle{

    private String model;
    private String regNo;
    private int makeYear;
    private String[] specialFeatures;

    public Tata(String model, String regNo, int makeYear, String[] specialFeatures) {
        this.model = model;
        this.regNo = regNo;
        this.makeYear = makeYear;
        this.specialFeatures = specialFeatures;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getMakeYear() {
        return this.makeYear;
    }

    @Override
    public String getRegNo() {
        return this.regNo;
    }

    @Override
    public String[] getSpecialFeature() {

        return this.specialFeatures;
    }
}
