package factory.system.tools;

public class MSS implements ElectricTools {

	// MSS - Micro Soldering Station.

	private String dataType;
	private String serialNumber;
	private int vat;
	private boolean indicationTemperature;
	private String description;
	private String guaranty;
	private String expluatationTime;

	public MSS(String dataType, String serialNumber, int vat, boolean indicationTemperature, String description,
			String guaranty, String expluatationTime) {
		this.dataType = dataType;
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

	public void solder(String electroDetail) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Solded " + electroDetail);
	}

	@Override
	public void printProperties() {
		System.out.println("Data type " + dataType);
		System.out.println("VAT " + vat);
		System.out.println("Indication temperature " + indicationTemperature);
		System.out.println("Description " + description);
		System.out.println("Guaranty" + guaranty);
		System.out.println("Expluatation time" + expluatationTime);
		System.out.println("Description " + description);
	}
}
