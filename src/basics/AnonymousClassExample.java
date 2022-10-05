package core.java.basics;

interface Playable {
	
	public void play();
}

public class AnonymousClassExample {
	
	class CdPlayer implements Playable {

		@Override
		public void play() {
			System.out.println("Song Playing from CD...");
		}
	}
	
	public static void main(String[] args) {
		
		AnonymousClassExample ace = new AnonymousClassExample();
		CdPlayer cdPlayer = ace.new CdPlayer();
		cdPlayer.play();
		
		Playable dvdPlayer = new Playable() {

			@Override
			public void play() {
				System.out.println("Song Playing from DVD...");
			}
			
		};
		
		dvdPlayer.play();

		Playable blueray = () -> {System.out.println();
		};
	}
}
