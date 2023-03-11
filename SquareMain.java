package OOP.Class;

public class SquareMain {

	public static void main(String[] args) {
		
		Square squ = new Square();
		
		squ.length = 4;
		
		System.out.printf("한변의 길이가 %d인 정사각형의 넓이: %d ",
				squ.length,squ.area());
		
		
		
		
		

	}

}
