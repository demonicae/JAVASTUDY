package OOP.Class.Scope;

public class CatMain {

	public static void main(String[] args) {

		Cat ca1 = new Cat();
		Cat ca2 = new Cat();

		ca1.name = "네로";
		ca2.name = "나비";

		ca1.meow();
		ca2.meow();
		ca1.claw();
		ca2.claw();

	}

}
