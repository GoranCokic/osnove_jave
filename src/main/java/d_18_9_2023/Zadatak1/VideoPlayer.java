package d_18_9_2023.Zadatak1;

public class VideoPlayer {
    protected int videoLength;
    protected int currentVideoTime;
    protected int soundLevel;
    protected int videoQuality; //144, 240, 360, 480, 720, 1080

    public VideoPlayer(int videoLength, int currentVideoTime, int soundLevel) {
        this.videoLength = videoLength;
        this.currentVideoTime = currentVideoTime;
        this.soundLevel = soundLevel;
    }

    public void print() {
        System.out.println("Current video time " + this.currentVideoTime);
        System.out.println("Sound level " + this.soundLevel);
        System.out.println("Video quality " + this.videoQuality);
    }
}
