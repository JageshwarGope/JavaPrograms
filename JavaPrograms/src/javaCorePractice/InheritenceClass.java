package javaCorePractice;

class parent{
	public parent() {
		System.out.println("parent cunstructor");
	}

	public void abcd() {
		System.out.println("Parent method");
	}

}

public class InheritenceClass extends parent {

	public InheritenceClass() {
		System.out.println("child cunstructor");
	}
	
	public void abc() {
		System.out.println("child method");
	}

	
	public static void main(String[] args) {
	
		InheritenceClass ob = new InheritenceClass();
		ob.abc();
		
//		parent ob2 = new parent();
//		ob2.abcd();

	}

}
