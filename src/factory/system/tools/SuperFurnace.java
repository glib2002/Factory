package factory.system.tools;

import factory.system.materials.Material;

public class SuperFurnace implements MechanicTools {

	private int maxTemperature;
	private String serialNumber;
	private int vat;
	private boolean indicationTemperature;
	private String description;
	private String guaranty;
	private String expluatationTime;

	public SuperFurnace(int maxTemperature, String serialNumber, int vat, boolean indicationTemperature,
			String description, String guaranty, String expluatationTime) {
		// TODO Auto-generated constructor stub
		this.maxTemperature = maxTemperature;
		this.serialNumber = serialNumber;
		this.vat = vat;
		this.indicationTemperature = indicationTemperature;
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
		System.out.println("Max temperature " + maxTemperature);
		System.out.println("VAT " + vat);
		System.out.println("Indication temperature " + indicationTemperature);
		System.out.println("Description " + description);
		System.out.println("Guaranty" + guaranty);
		System.out.println("Expluatation time" + expluatationTime);
		System.out.println("Description " + description);
	}

	public void cust(Material material) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Cust " + material);
	}
}
