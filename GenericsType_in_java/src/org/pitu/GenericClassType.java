package org.pitu;

public class GenericClassType<Band> {
	
	Band t;
	public void setT(Band t){
		this.t=t;
	}
	public Band getT(){
		return t;
	}

	public static void main(String[] args) {
		GenericClassType<Integer> intClass = new GenericClassType<Integer>();
		intClass.setT(456);
		System.out.println(intClass.getT());

	}

}
