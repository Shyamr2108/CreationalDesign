package com.masai.abstractfactory.app;

public class TataFactory implements VehicleAbstractFactory {
	
	private String model;
	private String regNo;
	private Integer makeYear;
	private String[] specialFeatures;
	
	

	public TataFactory(String model, String regNo, Integer makeYear, String[] specialFeatures) {
		super();
		this.model = model;
		this.regNo = regNo;
		this.makeYear = makeYear;
		this.specialFeatures = specialFeatures;
	}



	@Override
	public Vehicle createVehicle() {
		return new Tata(model, regNo, makeYear, specialFeatures);
	}
}
