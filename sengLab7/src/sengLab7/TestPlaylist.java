package sengLab7;
public class TestPlaylist {
	public static void main (String [] args) {
	Playlist pl = new Playlist("My favourite Songs:");
	pl.addSong("Divane");
	pl.addSong("Kumralım");
	pl.addSong("Sonsuz ol");
	
	pl.printSongs();
	System.out.println("Total songs: " + pl.getSongCount());
	
	System.out.println("\nRemoving ...'Sonsuz ol'....\n");
	pl.removeSong("\nSonsuz ol");
	
	pl.printSongs();
	System.out.println("Total songs: " + pl.getSongCount());
	
    }
}
