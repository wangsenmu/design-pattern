package com.wsm.design.pattern.create.factorymethod;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IFactory factory = new ToyFactory();
		factory.createProduct();
	}

}
