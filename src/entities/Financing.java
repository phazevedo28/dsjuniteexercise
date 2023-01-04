package entities;

public class Financing {

	private Double totalAmount;
	private Double income;
	private Integer months;

	public Financing(Double totalAmount, Double income, Integer months) {
		validateFinancing(totalAmount, income, months);
		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;

	}

	public Financing() {

	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.validateFinancing(totalAmount, income, months);
		this.totalAmount = totalAmount;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.validateFinancing(totalAmount, income, months);
		this.income = income;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.validateFinancing(totalAmount, income, months);
		this.months = months;
	}

	public double entry() {
		return 0.2 * totalAmount;
	}

	public double quota() {
		return (this.totalAmount - this.entry()) / this.months;
	}

	private void validateFinancing(Double totalAmount, Double income, Integer months) {
		if (0.8 * totalAmount / months > income / 2.0) {
			throw new IllegalArgumentException();
		}
	}

}
