package OOP.Class;

public class Song {
	
	String name;
	String singer;
	
	Song(String n, String s){
		
		name = n;
		singer= s;
		
	
	}
	
	String so () {
		return String.format("Song{name : %s, singer : %s}",
				name, singer);
		
	}
	
	
	
}
