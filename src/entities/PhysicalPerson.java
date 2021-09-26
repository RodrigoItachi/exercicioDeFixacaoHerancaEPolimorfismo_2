package entities;

public class PhysicalPerson extends People {

	private Double healthExpenses;

	public PhysicalPerson() {
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double tax() {
		if (getAnnualIncome() < 20000) {
			return (getAnnualIncome() * .15) - (healthExpenses * .5);
		} else {
			return (getAnnualIncome() * .25) - (healthExpenses * .5);
		}
	}

}