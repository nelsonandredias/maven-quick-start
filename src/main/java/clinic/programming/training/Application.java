package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public void greet(){
		
		List<String> greetings = new ArrayList<String>();
		greetings.add("Hello");
		greetings.add("Ola");
		greetings.add("Hola");
		
		for (String greet : greetings){
			
			System.out.println("Greeting: " + greet);
			
		}
		
	}


	public Application() {
		System.out.println("Inside Application");
	}
	
	//method main(): ALWAYS the APPLICATION entry point
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Starting Application");
		
		Application app = new Application();
		
		app.greet();
		
	}

}
