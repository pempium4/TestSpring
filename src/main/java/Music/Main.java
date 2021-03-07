package Music;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer song = context.getBean("musicPlayer", MusicPlayer.class);
        song.playMusic();
        System.out.println("Volume: " + song.getVolume());

        context.close();
    }
}
