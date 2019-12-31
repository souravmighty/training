/**
 * 
 */
package entities;

/**
 * @author admin
 *
 */
public class Guest {
	private int id;
	private String name;
	
	public Guest() {
		this(0, "");
	}

	public Guest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Guest [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
		{
			return true;
		}
		if (obj == null || !(obj instanceof Guest))
		{
			return false;
		}
		Guest g=(Guest)obj;
		return g.id==this.id;
	}
	
	

}
