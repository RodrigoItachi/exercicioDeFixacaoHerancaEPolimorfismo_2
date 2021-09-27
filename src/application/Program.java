package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.People;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.CANADA);
		Scanner read = new Scanner(System.in);
		List<People> peoples = new ArrayList<>();

		System.out.print("Enter the number of taxpayers: ");
		int n = read.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax paye #" + i + " data");
			System.out.print("Individual or Company (i/c)? ");
			Character condition = read.next().charAt(0);

			System.out.print("Name: ");
			String name = read.next();
			System.out.print("Anual income: ");
			Double annualIncome = read.nextDouble();

			if (condition == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenses = read.nextDouble();

				peoples.add(new PhysicalPerson(name, annualIncome, healthExpenses));
			} else {
				System.out.print("Number of employees: ");
				Integer quantity = read.nextInt();

				peoples.add(new LegalPerson(name, annualIncome, quantity));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");
		for (People people : peoples) {
			System.out.println(people);
		}

		Double totalTaxes = 0.0;
		for (People people : peoples) {
			totalTaxes += people.tax();
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: %.2f", totalTaxes);
		read.close();
	}

}