package OOP.Class.basic;

public class Main01 {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.name = "멍무이";
		c1.breeds = "페르시안";
		c1.age = 13;

		Dog d1 = new Dog();
		d1.name = "멍무리";
		d1.breeds = "페르시안";
		d1.age = 48;

		System.out.printf("이름 : %s\n", c1.name);
		System.out.printf("품종 : %s\n", c1.breeds);
		System.out.printf("나이 : %d\n", c1.age);

		System.out.printf("이름 : %s\n", d1.name);
		System.out.printf("품종 : %s\n", d1.breeds);
		System.out.printf("나이 : %d\n", d1.age);

	}

}
