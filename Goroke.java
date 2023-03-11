package OOP.Class;

public class Goroke {

	String name;
	int price;

	Goroke(String n, int p) {

		name = n;
		price = p;

	}

	String sta() {

		return String.format("Goroke{name :%s,price : %d", name, price);
	}

}
