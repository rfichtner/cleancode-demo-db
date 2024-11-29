package software.xdev.fullstackjava;

/**
 * Java 1.6 - 2006
 */
public class Pizza06 {


	private final String menuId;
	private final String name;
	private final int calories;
	private final String desciption;

	public Pizza06(final String menuId, final String name, final int calories, final String desciption) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + ((desciption == null) ? 0 : desciption.hashCode());
		result = prime * result + ((menuId == null) ? 0 : menuId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza06 other = (Pizza06) obj;
		if (calories != other.calories)
			return false;
		if (desciption == null) {
			if (other.desciption != null)
				return false;
		} else if (!desciption.equals(other.desciption))
			return false;
		if (menuId == null) {
			if (other.menuId != null)
				return false;
		} else if (!menuId.equals(other.menuId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
