package OOP.Class.Scope;

public class DmMain {

	public static void main(String[] args) {
		
		DrinkMachine DM1 = new DrinkMachine();
		DrinkMachine DM2 = new DrinkMachine();
		
		
		DM1.PushButton(1);
		DM2.PushButton(2);
		
		
		DM1.PrintOutput();
		DM2.PrintOutput();

	}

}
