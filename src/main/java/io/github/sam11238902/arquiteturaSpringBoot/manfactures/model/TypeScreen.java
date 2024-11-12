package io.github.sam11238902.arquiteturaSpringBoot.manfactures.model;

public class TypeScreen {
	
	private String type;
	private String size;
	
	
	public TypeScreen(String type, String size) {
		super();
		this.type = type;
		this.size = size;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "TypeScreen [type=" + type + ", size=" + size + "]";
	}
	
	
	
	

	
}
