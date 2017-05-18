public class Preference {

	int quietTime;
	int music;
	int reading;
	int chatting;

	public Preference(int quietTimeNum, int musicNum, int readNum, int chatNum) {

		quietTime = quietTimeNum;
		music = musicNum;
		reading = readNum;
		chatting = chatNum;

	}

	public int getQuietTime() {
		return this.quietTime;
	}

	public int getMusic() {
		return this.music;
	}

	public int getRead() {
		return this.reading;
	}

	public int getChat() {
		return this.chatting;
	}

	public int compare(Preference pref) {
		int difference = Math.abs((pref.getQuietTime() - this.getQuietTime()));
		difference += Math.abs((pref.getMusic() - this.getMusic()));
		difference += Math.abs((pref.getRead() - this.getRead()));
		difference += Math.abs((pref.getChat() - this.getChat()));

		return difference;
	}
}