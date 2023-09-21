package d_18_9_2023.Zadatak1;

public class AudioControl extends Control {
    protected boolean changeVideoAudio;

    public AudioControl(boolean changeVideoAudio) {
        this.changeVideoAudio = changeVideoAudio;
    }

    //increases or decreases soundLevel by 1
    @Override
    public void doAction(VideoPlayer videoPlayer) {
        if (changeVideoAudio && videoPlayer.soundLevel < 100) {
            videoPlayer.soundLevel = videoPlayer.soundLevel + 1;
            if (videoPlayer.soundLevel > 100) {
                videoPlayer.soundLevel = 100;
            }
        } else {
            videoPlayer.soundLevel = videoPlayer.soundLevel - 1;
            if (videoPlayer.soundLevel < 0) {
                videoPlayer.soundLevel = 0;
            }
        }
    }
}
