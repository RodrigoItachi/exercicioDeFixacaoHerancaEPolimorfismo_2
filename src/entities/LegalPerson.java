package entities;

public class LegalPerson extends People {
	private Integer quantity;

	public LegalPerson() {
	}

	public LegalPerson(String name, Double annualIncome, Integer quantity) {
		super(name, annualIncome);
		this.quantity = quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
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