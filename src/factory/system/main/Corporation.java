package factory.system.main;

import factory.system.workers.Boss;
import factory.system.workers.Cleaner;
import factory.system.workers.Manager;
import factory.system.workers.Mechanic;
import factory.system.workers.UniversalRobot;
import factory.system.works.DoSomething;

public class Corporation {

	private String name;
	private int numPersonal;
	private String owner;
	private String city;
	private String country;

	

	public Corporation(String name, int numPersonal, String owner, String city, String country) {
		this.city = city;
		this.country = country;
		this.name = name;
		this.numPersonal = numPersonal;
		this.owner = owner;
	}

	public void start() {
		printProperty();
		Cleaner[] cleaner = new Cleaner[2];
		cleaner[0] = new Cleaner("Vasia", "Cleaner", "Petrov", 4,"3200");
		cleaner[1] = new Cleaner("Kostya", "Cleaner", "Ivanov", 3,"3000");
		

		for (Cleaner cleaner1 : cleaner) {
			cleaner1.clean(cleaner1.getSquareMeters(), cleaner1.getName());
		}
		// Mechanics
		Mechanic[] mechanic = new Mechanic[2];
		mechanic[0] = new Mechanic("Sandy", "Cleaner", "Michulin", 45,"7000");
		mechanic[1] = new Mechanic("Dima", "Cleaner", "Ivanov", 34,"7000");
		

		for (Mechanic mech : mechanic) {
			mech.fix(mech.getNumFixed(), mech.getName());
		}
		// Managers
		Manager[] manager = new Manager[2];
		manager[0] = new Manager("Sandyz", 5000, "Michulin", 4500);
		manager[1] = new Manager("Dima", 5000, "Ivanov", 3456);
		

		for (Manager man : manager) {
			man.printDocuments(man.getSalary(), man.getName());
		}
		// Boss
		Boss boss = new Boss("Nick boss", 19000);
		boss.signing(50);
		boss.deleteWorker(null);
		boss.clean(1, "NICK");
		boss.rest(19);
		boss.sign = manager[0];
		boss.sign = manager[1];

		int maxOfCleaners = boss.sort(Integer.parseInt(cleaner[0].getSalary()), Integer.parseInt(cleaner[1].getSalary()));
		System.out.println("The max salary of cleaners is "+maxOfCleaners);
		int maxOfMechanics = boss.sort(Integer.parseInt(mechanic[0].getSalary()), Integer.parseInt(mechanic[1].getSalary()));
		System.out.println("The max salary of mechanics is "+maxOfMechanics);
		int maxOfManagers = boss.sort(manager[0].getSalary(), manager[1].getSalary());
		System.out.println("The max salary of managers is "+maxOfManagers);
		for (Manager man : manager) {
			man.signing(90);
		}
	    UniversalRobot ur = new UniversalRobot("INTEL PENTIUM I-876554 CORE", "Version 5.0", "Kingstone", "CATERPILAR","DIGITAL", "R2-D2");
	    ur.controleWorking(boss);
	    ur.helpAnybody(manager);
	    ur.protect(56);
	    ur.getCharacteristics();
	    //
	    cleaner[0].unifunk = ur;
	    cleaner[1].unifunk = ur;
	    
	    //
	    mechanic[0].unifunk = ur;
	    mechanic[1].unifunk = ur;
	    
	    //
	    manager[0].unifunk = ur;
	    manager[1].unifunk = ur;
	   
	    //??????????????
	    boss.unifunk = ur;
	    ur.helpAnybody(manager);
	    ur.getCharacteristics();
	    ur.controleWorking(boss);
	    
	}

	public void printProperty() {
		System.out.println("Name " + name);
		System.out.println("City " + city);
		System.out.println("Personal " + numPersonal);
		System.out.println("Owner " + owner);
		System.out.println("Country " + country);

	}
}
