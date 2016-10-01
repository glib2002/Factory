package factory.system.workers;

import factory.system.works.Cleaning;
import factory.system.works.DoSomething;
import factory.system.works.Signing;

public class Manager extends Boss implements Signing, Cleaning {
	private String nameMan;
	private int manSalary;
	public DoSomething doSomething;
	public UniversalFunction unifunk;
	public Manager(String name, int salary, String nameMan, int manSalary) {
		super(name, salary);
		this.nameMan = nameMan;
		this.manSalary = manSalary;
	}

	public int getSalary() {
		return manSalary;
	}

	public String getNameMan() {
		return nameMan;
	}

	@Override
	public void clean(int squareMeters, String name) {
		System.out.println("I cleaned " + "(" + name + ")" + squareMeters);

	}

	@Override
	public void printDocuments(int salary, String name) {
		System.out.println("name " + name + " get salary " + salary);

	}
}
