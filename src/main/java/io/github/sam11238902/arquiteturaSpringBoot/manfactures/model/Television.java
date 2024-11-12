package io.github.sam11238902.arquiteturaSpringBoot.manfactures.model;

public class Television {
	
	private String name;
	private Brand brand;
	private TypeScreen typeScreen;
	
	
	
	
	
	public Television(String name, Brand brand, TypeScreen typeScreen) {
		super();
		this.name = name;
		this.brand = brand;
	
		this.typeScreen = typeScreen;
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
	
	
	public TypeScreen getTypeScreen() {
		return typeScreen;
	}
	public void setTypeScreen(TypeScreen typeScreen) {
		this.typeScreen = typeScreen;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Television [name=" + name + ", brand=" + brand + ", typeScreen=" + typeScreen + "]";
	}
	
	
	
	public String turnOnTV(TelevisionControl televisionControl) {
		
		if(televisionControl.getBrand().equals(this.getBrand())) {
			return "Tv on! Dados da tv : " + this.toString();
		}
		return "This control does not correspond to this TV";
	
		
	}
	

}
