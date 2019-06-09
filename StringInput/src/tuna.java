
public class tuna {
	private String Girlname;
	public void setname (String name) {
		Girlname = name;
	}
	public tuna(String name) {
		Girlname = name;
	}
	public String getName() {
		return Girlname;
	}
	public void saying() {
		System.out.printf(getName().equals("Mika") ? "You are correct your first gf is %s\n" : "Think harder your first gf is not %s\n", getName(), getName());
	}
}
