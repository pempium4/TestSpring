package Music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //ручное внедрение зависимости
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer song = new MusicPlayer(music);
//        song.playMusic();

//        MusicPlayer song = context.getBean("musicPlayer", MusicPlayer.class);
//        song.playMusic();
//        System.out.println("Volume: " + song.getVolume());

        MusicPlayer song1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer song2 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = song1 == song2;
        System.out.println(comparison);

        song1.setVolume(40);
        System.out.println("Volume of song1:" + song1.getVolume());
        System.out.println("Volume of song2:" + song2.getVolume());

        context.close();
    }
}
