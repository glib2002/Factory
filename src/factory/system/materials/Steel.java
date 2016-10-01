package factory.system.materials;

public class Steel implements SynteticMaterials {

	public Steel() {
		// TODO Auto-generated constructor stub
	}

	private int topTemperatureLevel;
	private String name;

	public Steel(int topTemperatureLevel, String name) {
		this.topTemperatureLevel = topTemperatureLevel;
		this.name = name;
	}

	@Override
	public void setSize(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Size " + x + " " + y);
	}

	@Override
	public void broken(int brokeLevel) {
		System.out.println("Broken level " + brokeLevel);

	}

	@Override
	public boolean isCust(SynteticMaterials sm) {
		Gum g = new Gum();
		if (sm.equals(g)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isHard(SynteticMaterials sm) {
		Gum g = new Gum();
		if (sm.equals(g)) {
			return true;
		}
		return false;
	}
}
