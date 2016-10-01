package factory.system.workers;

import factory.system.tools.Tool;
import factory.system.works.*;

public class UniversalRobot implements UniversalFunction {
	private String CPU;
	private String version;
	private String RAM;
	private String engine;
	private String dataType;
	private String number;

	public DoSomething doSome;
	public Cleaning clean;
	public Signing sign;
	public Fix fix;
	public UniversalRobot(String CPU, String version, String RAM, String engine, String dataType, String number) {
		this.CPU = CPU;
		this.dataType = dataType;
		this.engine = engine;
		this.number = number;
		this.RAM = RAM;
		this.version = version;

	}

	@Override
	public void protect(int squareMeters) {

		System.out.println("I protected " + squareMeters);
        
	}

	

	@Override
	public void helpAnybody(Object any) {

		System.out.println("I helped " + any);

	}

	@Override
	public void fix(String detail) {

		System.out.println("I fixed tool " + detail);

	}

	@Override
	public void fix(Tool tool) {
		System.out.println("I fixed tool " + tool);

	}

	@Override
	public void getCharacteristics() {

		System.out.println("CPU :" + CPU);
		System.out.println("Data type :" + dataType);
		System.out.println("Engine :" + engine);
		System.out.println("Number :" + number);
		System.out.println("RAM :" + RAM);
		System.out.println("Version :" + version);
	}

	@Override
	public void controleWorking(Boss boss) {

		System.out.println("I controled worker " + boss);
	}

}
