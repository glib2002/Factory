package factory.system.tools;

public class UPS implements ElectricTools {

	private String supply;
	private String serialNumber;
	private String power;
	private String standart;
	private String description;
	private String guaranty;
	private String expluatationTime;

	// Uninterruptible Power Supply
	public UPS(String supply, String power, String standart, String serialNumber, String description, String guaranty,
			String expluatationTime) {
		this.supply = supply;
		this.serialNumber = serialNumber;
		this.power = power;
		this.standart = standart;
		this.description = description;
		this.guaranty = guaranty;
		this.expluatationTime = expluatationTime;
	}

	public boolean topVatLevel(int vat) {
		if (vat < 220) {
			return true;
		}
		return false;
	}

	@Override
	public int broke(int brokeLevel) {
		System.out.println("Tool broken " + " level " + brokeLevel);
		return brokeLevel;
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

	@Override
	public void printProperties() {
		System.out.println("Supply " + supply);
		System.out.println("Power " + power);
		System.out.println("Standart " + standart);
		System.out.println("Description " + description);
		System.out.println("Guaranty" + guaranty);
		System.out.println("Expluatation time" + expluatationTime);
		System.out.println("Description " + description);
	}
}
