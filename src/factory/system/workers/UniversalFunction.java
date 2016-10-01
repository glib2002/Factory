package factory.system.workers;

import factory.system.tools.Tool;

public interface UniversalFunction {
	public void controleWorking(Boss boss);

	public void protect(int squareMeters);

	public void helpAnybody(Object any);

	public void fix(String detail);

	public void fix(Tool tool);

	public void getCharacteristics();

	
}
