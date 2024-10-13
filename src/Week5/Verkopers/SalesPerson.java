package Week5.Verkopers;

public class SalesPerson {

	private String name;
	private double revenue;

	public SalesPerson(String name, double revenue) {
		this.name = name;
		this.revenue = revenue;
	}

	public boolean generatesMoreRevenueThan(SalesPerson salesPerson) {
		return (this.revenue > salesPerson.getRevenue());
	}

	public String getName() {
		return name;
	}

	public double getRevenue() {
		return revenue;
	}

	@Override
	public String toString() {
		return name + " met een omzet van €" + revenue;
	}
}
