package software.xdev.fullstackjava;

/**
 * Java 1.7 (Java 7) - 2011
 */
public class Pizza07 {

	

	private final String menuId;
	private final String name;
	private final int calories;
	private final String desciption;

	public Pizza07(final String menuId, final String name, final int calories, final String desciption) {
		super();
		this.menuId = menuId;
		this.name = name;
		this.calories = calories;
		this.desciption = desciption;
	}

	public String getName() {
		return this.name;
	}

	public int getCalories() {
		return this.calories;
	}

	public String getMenuId() {
		return this.menuId;
	}

	public String getDesciption() {
		return this.desciption;
	}

	@Override
	public String toString() {
		return "Pizza [menuId=" + this.menuId + ", name=" + this.name + ", calories=" + this.calories + ", desciption="
				+ this.desciption
				+ "]";
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(calories, desciption, menuId, name);
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza)obj;
		return calories == other.calories && Objects.equals(desciption, other.desciption)
			&& Objects.equals(menuId, other.menuId) && Objects.equals(name, other.name);
	}

}
