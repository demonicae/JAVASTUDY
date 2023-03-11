package OOP.Class;

public class Drink {

	String name;
	int price;
	
	Drink(){}
	
	String Dre() {
		
		return String.format("Drink{name : %s, price : %d", name,
				price);
	}
	
}
