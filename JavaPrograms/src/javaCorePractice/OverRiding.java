package javaCorePractice;

class abcd{
	public int abc = 2;
	public abcd() {
		System.out.println("Parent cuns");
	}
}


public class OverRiding extends abcd {
	
	public int abc = 5;
	
	public OverRiding() {
		System.out.println("child cuns");
	}
	

	public static void main(String[] args) {
		
//		OverRiding ob =  new OverRiding();
//		
//		System.out.println(ob.abc);
		
		abcd ob2 = new abcd();
		System.out.println(ob2.abc);

	}

}
