package io.github.sam11238902.arquiteturaSpringBoot.manfactures.model;

public class TelevisionControl {
	private String name;
	private Brand brand;
	
	
	
	
	public TelevisionControl(String name, Brand brand) {
		super();
		this.name = name;
		this.brand = brand;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	

	@Override
	public String toString() {
		return "TelevisionControl [name=" + name + ", brand=" + brand + "]";
	}	
}


