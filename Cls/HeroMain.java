package OOP.Class.Cls;

public class HeroMain {

	public static void main(String[] args) {
		
		Hero h1 = new Hero("토르", 160);
		Hero h2 = new Hero("타노스", 150);
		
		h1.punch(h2);
		h2.punch(h1);
		h2.punch(h1);
		
		

	}

}
