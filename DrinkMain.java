package OOP.Class;

public class DrinkMain {

	public static void main(String[] args) {
		
		Drink d1 = new Drink();
		Drink d2 = new Drink();
		
		d1.name = "포카리";
		d1.price = 1000;
		
		d2.name = "박카스";
		d2.price = 800;
		
		System.out.println(d1.Dre());
		
		System.out.println(d2.Dre());
		
		

	}

}
