package factory.system.workers;

import factory.system.works.Cleaning;

public class Cleaner extends Worker implements Cleaning {
	private String cleanerName;
	private int squareMeters;
	private String salary;
	public UniversalFunction unifunk;
	public Cleaner(String name, String current, String cleanerName, int squareMeters,String salary) {
		super(name, current);
		this.cleanerName = cleanerName;
		this.squareMeters = squareMeters;
	    this.salary = salary;
	}

	@Override
	public void clean(int squareMeters, String name) {
		System.out.println("I cleaned " + "(" + name + ")" + squareMeters);

	}

	public int getSquareMeters() {
		return squareMeters;
	}

	public String getCleanerName() {
		return cleanerName;
	}
	public String getSalary() {
		return salary;
	}
}
