package javaCorePractice;

class Engine {
	public void start() {
		System.out.println("Engine Started");
	}
}

class TruckEngine extends Engine{
	
	@Override
	public void start() {
		System.out.println("Truck Engine Started");
	}
}


public class CompositionClass {
	
	private Engine engine;
	
	public CompositionClass(Engine engine) {
		this.engine  = engine;
	}
	
	public void startV() {
		engine.start();
	}
	
	

	public static void main(String[] args) {
		
		Engine en = new Engine();
		
		CompositionClass ob = new CompositionClass(en);
		
		ob.startV();  
		
		TruckEngine te = new TruckEngine();
		
		CompositionClass ob2 = new CompositionClass(te);
		
		ob2.startV();
		

	}

}
