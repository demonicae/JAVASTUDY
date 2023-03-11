package OOP.Class;

public class ConstructorMain {

	public static void main(String[] args) {
		
		constructor b1 = new constructor("부릉2", 21.74,899000);
		constructor b2 = new constructor("씽씽2", 12.57,495000);
		
		
		
		System.out.printf("Bicycle{%s,%.2f,%d}\n",b1.name,b1.weight,b1.price );
		System.out.printf("Bicycle{%s,%.2f,%d}",b2.name,b2.weight,b2.price );
		
		

	}

}
