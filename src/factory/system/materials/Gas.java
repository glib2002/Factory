package factory.system.materials;

public class Gas implements OrganicMaterials {

	private int topTemperatureLevel;
	private String name;
	private boolean isFlamable;

	public Gas() {

	}

	public Gas(int topTemperatureLevel, String name, boolean isFlamable) {
		this.topTemperatureLevel = topTemperatureLevel;
		this.name = name;
		this.isFlamable = isFlamable;
	}

	@Override
	public void setSize(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Size " + x + " " + y);
	}

	@Override
	public void broken(int brokeLevel) {
		System.out.println("Cant broken");

	}

	@Override
	public boolean isDangerous(OrganicMaterials m) {
		Gas g = new Gas();
		if (m.equals(g)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFlamable(OrganicMaterials m) {
		Gas g = new Gas();
		if (m.equals(g)) {
			return true;
		}
		return false;

	}

}
