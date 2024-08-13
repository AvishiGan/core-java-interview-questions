package programming_questions.design_patterns.structural.adapter;

public class MediaAdapter implements MediaPlayer {

    VlcPlayer vlcPlayer;

    public MediaAdapter(VlcPlayer vlcPlayer) {
        setVlcPlayer(vlcPlayer);
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        }
    }

    public VlcPlayer getVlcPlayer() {
        return vlcPlayer;
    }

    public void setVlcPlayer(VlcPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }
}
