package Music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
//    @Autowired
//    @Qualifier ("musicBean")
    private Music music;

    @Value("${musicPlayer.volume}")
    private int volume;

//    автоматическое внедрение зависимостей (Dep Inj)
    @Autowired
    public MusicPlayer(@Qualifier("musicBean") Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing... " + music.getSong());
    }

    public int getVolume() {
        return volume;
    }
}
