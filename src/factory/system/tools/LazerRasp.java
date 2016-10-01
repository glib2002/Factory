package factory.system.tools;

public class LazerRasp implements MechanicTools {

	private String power;
	private String serialNumber;
	private String core;
	private String description;
	private String guaranty;
	private String expluatationTime;

	public LazerRasp(String power, String serialNumber, String core, String description, String guaranty,
			String expluatationTime) {

		this.serialNumber = serialNumber;
		this.power = power;
		this.core = core;
		this.description = description;
		this.guaranty = guaranty;
		this.expluatationTime = expluatationTime;
	}

	@Override
	public int broke(int brokeLevel) {
		System.out.println("Tool broken " + " level " + brokeLevel);
		return brokeLevel;
	}

	@Override
	public void printProperties() {
		System.out.println("Power " + power);
		System.out.println("CORE " + core);
		System.out.println("Description " + description);
		System.out.println("Guaranty" + guaranty);
		System.out.println("Expluatation time" + expluatationTime);
		System.out.println("Description " + description);

	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public String getGuaranty() {
		// TODO Auto-generated method stub
		return guaranty;
	}

	@Override
	public String getExpluatationTime() {
		// TODO Auto-generated method stub
		return expluatationTime;
	}

	@Override
	public String getSerialNumber() {
		// TODO Auto-generated method stub
		return serialNumber;
	}

	public void cut(String detail, int size) {
		System.out.println("Cut detail " + detail + " size " + size);
	}

}
