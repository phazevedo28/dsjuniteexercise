package test.Factory;

import entities.Financing;

public class FactoryFinancing {

	public static Financing createFinancing(Double totalAmount, Double income, Integer months) {
		return new Financing(totalAmount, income, months);
	}

}
