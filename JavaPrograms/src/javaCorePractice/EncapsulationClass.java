package javaCorePractice;


public class EncapsulationClass {
	
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
	public static void main(String[] args) {
		
		EncapsulationClass ob = new EncapsulationClass();
		ob.setId(21);
		ob.setName("Hello");
		
		System.out.println(ob.getId());
		System.out.println(ob.getName());

	}

}
