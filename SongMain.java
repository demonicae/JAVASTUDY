package OOP.Class;

public class SongMain {

	public static void main(String[] args) {
		
		Song s1 = new Song("별헤는 밤", "유재하");
		Song s2 = new Song("비상", "임재범");
		Song s3 = new Song("비밀", "박완규");
		
		Song[] songs = {s1,s2,s3};
		
		for(int i = 0; i<songs.length; i++) {
			System.out.println(songs[i].so());
		}
		
		

	}

}
