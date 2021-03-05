package Music;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    //setter (useless)
    /*public MusicPlayer(){};

    public void setMusic(Music music) {
        musicList.add(music);
    }*/

    public void playMusic() {
        for (Music music:musicList) {
            System.out.println("Playing... " + music.getSong());
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
