package entities;

public class LegalPerson extends People {
	private Double quantity;

	public LegalPerson() {
	}

	public LegalPerson(String name, Double annualIncome, Double quantity) {
		super(name, annualIncome);
		this.quantity = quantity;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	@Override
	public Double tax() {
		if (quantity >= 1 && quantity <= 10) {
			return getAnnualIncome() * 0.16;
		} else {
			return getAnnualIncome() * 0.14;
		}
	}

}