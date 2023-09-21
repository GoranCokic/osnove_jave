package d_18_9_2023.Zadatak1;

public class TimeControl extends Control {
    protected boolean changeVideoTime;

    public TimeControl(boolean changeVideoTime) {
        this.changeVideoTime = changeVideoTime;
    }

    //increases or decreases currentVideoTime by 15
    @Override
    public void doAction(VideoPlayer videoPlayer) {
        if (changeVideoTime && videoPlayer.currentVideoTime < videoPlayer.videoLength) {
            videoPlayer.currentVideoTime = videoPlayer.currentVideoTime + 15;
            if (videoPlayer.currentVideoTime > videoPlayer.videoLength) {
                videoPlayer.currentVideoTime = videoPlayer.videoLength;
            }
        } else {
            videoPlayer.currentVideoTime = videoPlayer.currentVideoTime - 15;
            if (videoPlayer.currentVideoTime < 0) {
                videoPlayer.currentVideoTime = 0;
            }
        }
    }

}
