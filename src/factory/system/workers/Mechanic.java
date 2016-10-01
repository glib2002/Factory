package factory.system.workers;

import factory.system.materials.Steel;
import factory.system.tools.LazerRasp;
import factory.system.tools.MSS;
import factory.system.works.Fix;

public class Mechanic extends Worker implements Fix {
	private String mehanicName;
	private int numFixed;
	private String salary;
	public UniversalFunction unifunk;
    public Steel steel = new Steel(6000, "AL");
	public MSS mss = new MSS("digital", "5674", 600, true, "wery good tool","dsa", "7 years");
	public LazerRasp lazerr = new LazerRasp("345 v", "TX-694594", "INTEL I-8569", "wery good tool","Super standart",
			"7 years");
	
    public Mechanic(String name, String current, String mehanicName, int numFixed,String salary) {
		super(name, current);
		this.mehanicName = mehanicName;
		this.numFixed = numFixed;
	    this.salary = salary;
    }

	@Override
	public void fix(int details, String name) {
		System.out.println("I fixed" + "(" + name + ")" + +details);
        lazerr.cut("circuit board", 5);
        steel.setSize(50, 50);
        mss.solder("circuit board");
	    
	}

	public int getNumFixed() {
		return numFixed;
	}

	public String getMehanicName() {
		return mehanicName;
	}
	public String getSalary() {
		return salary;
	}
}
