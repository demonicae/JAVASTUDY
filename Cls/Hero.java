package OOP.Class.Cls;

public class Hero {

	String name ;
	int hp;
	
	Hero(String n, int h){
		
		name = n;
		hp = h;
		
	}
	void punch(Hero enemy) {
		System.out.printf("[%s]의 펀치!!", name);
		
		System.out.printf("%s의 HP : %d ->",enemy.name,enemy.hp);
	enemy.hp -= 10;
		System.out.printf("%d\n",enemy.hp);
		
	}
	
	
}
