package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords( String words){
		
		String[] separatorWords = StringUtils.split(words, ' ');
		return (separatorWords == null) ? 0 : separatorWords.length;
	}

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
		
		int count = app.countWords("I have four words");
		System.out.println("Word count is : " + count);
	
	}

}
