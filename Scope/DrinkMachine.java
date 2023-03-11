package OOP.Class.Scope;

public class DrinkMachine {

	String output;

	
	void PushButton(int num) {
		
		String[] drink = { "콜라", "사이다", "환타" };

		output = drink[num];

	}

	void PrintOutput() {
		System.out.println(output);
	}
	
}
