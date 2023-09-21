package d_18_9_2023.Zadatak1;

public class QualityOptimizerControl extends Control {
    protected double internetSpeed; // 10mb/s 7.6mb/s...

    public QualityOptimizerControl(double internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    public void doAction(VideoPlayer videoPlayer) {
        double internetQualityValue = this.internetSpeed * 10.1;
        int[] validVideoFormats = {144, 240, 360, 480, 720, 1080};
        videoPlayer.videoQuality = validVideoFormats[validVideoFormats.length - 1];
        int i = 0;
        while (i < validVideoFormats.length - 1) {
            if (internetQualityValue <= validVideoFormats[i]) {
                videoPlayer.videoQuality = validVideoFormats[i];
            }
            i++;
        }
    }
}
