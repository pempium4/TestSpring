package Music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer song = context.getBean("musicPlayer", MusicPlayer.class);
        song.playMusic();
        System.out.println("Volume: " + song.getVolume());

        //scope test
        ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2);

        context.close();
    }
}
