package OOP.Class.Cls;

public class BicycleMain {

	public static void main(String[] args) {
		
		Bicycle b1 = new Bicycle();
		Bicycle b2 = new Bicycle();
		
		b1.name= "로드형 자전거";
		b1.weight= 7.25;
		b1.price= 326000;
		
		System.out.printf("b1 -> {%s, %.2f, %d}\n",b1.name,b1.weight
				,b1.price);
		
		
		b2.name= "산악형 자전거";
		b2.weight= 10.68;
		b2.price= 429000;
		
		System.out.printf("b2 -> {%s, %.2f, %d}",b2.name,b2.weight
				,b2.price);
		
		
		
		

	}

}
