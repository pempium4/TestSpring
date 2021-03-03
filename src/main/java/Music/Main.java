package Music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //ручное внедрение зависимости
        /*Music music = context.getBean("musicBean", Music.class);
        MusicPlayer song = new MusicPlayer(music);
        song.playMusic();*/

        MusicPlayer song = context.getBean("musicPlayer", MusicPlayer.class);
        song.playMusic();
        System.out.println("Volume: " + song.getVolume());

        context.close();
    }
}
