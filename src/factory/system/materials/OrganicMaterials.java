package factory.system.materials;

public interface OrganicMaterials extends Material {
	public boolean isDangerous(OrganicMaterials m);

	public boolean isFlamable(OrganicMaterials m);

}
