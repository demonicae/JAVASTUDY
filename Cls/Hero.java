package OOP.Class.Cls;

public class Hero {

	String name ;
	int hp;
	
	Hero(String n, int h){
		
		name = n;
		hp = h;
		
	}
	void punch(Hero enemy) {
		System.out.printf("[%s]μ νμΉ!!", name);
		
		System.out.printf("%sμ HP : %d ->",enemy.name,enemy.hp);
	enemy.hp -= 10;
		System.out.printf("%d\n",enemy.hp);
		
	}
	
	
}
