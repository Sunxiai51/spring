package soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;
	private List<String> tracks;

	@Override
	public void play() {
		// System.out.println("Playing " + title + " by " + artist);
		// for (String track : tracks) {
		// System.out.println("-Track: " + track);
		// }
		for (int i = 0; i < tracks.size(); i++) {
			playTrack(i);
		}
	}

	public void playTrack(int trackNum) {
		System.out.println("Playing " + title + " by " + artist + "-Track: " + tracks.get(trackNum));
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

}
