package test.entities;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Financing;
import test.Factory.FactoryFinancing;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenDataIsValid() {
		// arrange
		// action
		Financing financing = FactoryFinancing.createFinancing(100000.0, 2000.0, 80);

		// assert
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}

	@Test
	public void constructorShouldThrowExceptionWhenDataIsNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			FactoryFinancing.createFinancing(100000.0, 2000.0, 20);
		});
	}

	@Test
	public void setTotalAmountShouldUpdateDataWhenDataIsValid() {
		// arrange
		Financing financing = FactoryFinancing.createFinancing(100000.0, 2000.0, 80);

		// action
		financing.setTotalAmount(90000.0);

		// assert
		Assertions.assertEquals(90000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}

	@Test
	public void SetTotalAmountShouldThrowExceptionWhenDataIsNotValid() {
		// arrange
		Financing financing = FactoryFinancing.createFinancing(100000.0, 2000.0, 80);
		// action
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			financing.setTotalAmount(1000000000.0);
		});
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}

	@Test
	public void setIncomeShouldUpdateDataWhenDataIsValid() {
		// arrange
		Financing financing = FactoryFinancing.createFinancing(100000.0, 2000.0, 80);

		// action
		financing.setIncome(3000.0);

		// assert
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(3000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}

	@Test
	public void SetIncomeShouldThrowExceptionWhenDataIsNotValid() {
		// arrange
		Financing financing = FactoryFinancing.createFinancing(100000.0, 2000.0, 80);
		// action
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			financing.setIncome(200.0);
		});
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}

	@Test
	public void setMonthsShouldUpdateDataWhenDataIsValid() {
		// arrange
		Financing financing = FactoryFinancing.createFinancing(100000.0, 2000.0, 80);

		// action
		financing.setMonths(90);

		// assert
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(90, financing.getMonths());
	}

	@Test
	public void SetMonthsThrowExceptionWhenDataIsNotValid() {
		// arrange
		Financing financing = FactoryFinancing.createFinancing(100000.0, 2000.0, 80);
		// action
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			financing.setMonths(40);
		});
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}

	@Test
	public void entryShouldCalculateCorrectValue() {
		// arrange
		Financing financing = FactoryFinancing.createFinancing(100000.0, 2000.0, 80);

		// action
		Double value = financing.entry();

		// assert
		Assertions.assertEquals(20000.0, value);
	}

	@Test
	public void quotaShouldCalculateCorrectValue() {
		// arrange
		Financing financing = FactoryFinancing.createFinancing(100000.0, 2000.0, 80);

		// action
		Double value = financing.quota();

		// assert
		Assertions.assertEquals(1000.0, value);
	}
}
