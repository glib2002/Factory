package factory.system.workers;

import factory.system.works.Cleaning;
import factory.system.works.DoSomething;
import factory.system.works.Signing;

public class Boss implements DoSomething, Cleaning {
	private String name;
	private int salary;
	public Signing sign;
    public UniversalFunction unifunk;
	public Boss(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	@Override
	public void signing(int signed) {
		System.out.println("SIGNED" + signed);

	}

	@Override
	public void deleteWorker(String name) {
		System.out.println("dELETE WORKER" + name);
	}

	@Override
	public int sort(int x ,int y) {
		int maxSalary = Math.max(x, y);
		return maxSalary;
		
	}

	@Override
	public void rest(int days) {
		System.out.println("I go to the rest " + days);

	}

	@Override
	public void clean(int squareMeters, String name) {
		System.out.println("I cleaned " + "(" + name + ")" + squareMeters);

	}
}
