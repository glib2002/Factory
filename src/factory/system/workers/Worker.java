package factory.system.workers;

import factory.system.works.Work;

public class Worker implements Work {
	private String name;
	private String current;

	public Worker(String name, String current) {
		this.current = current;
		this.name = name;
	}

	@Override
	public void work(String currentWork) {
		System.out.println("Worker work" + currentWork);
	}

	public String getName() {
		return name;
	}

	public String getCurrent() {
		return current;
	}
}
