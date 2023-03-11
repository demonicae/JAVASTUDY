package OOP.Class.Cls;

public class Main01 {

	public static void main(String[] args) {

		tat c = new tat();

		c.name = "네로";
		c.breeds = "페르시안";
		c.age = 3;

		System.out.printf("이름 : %s\n", c.name);
		System.out.printf("품종 :%s\n", c.breeds);
		System.out.printf("나이 :%d\n", c.age);

	}

}
