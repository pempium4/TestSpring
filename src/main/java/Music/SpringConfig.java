package Music;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@ComponentScan("Music")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    //ручное создание бина
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean RockMusic rockMusic(){
        return new RockMusic();
    }
    //list of beans DI
    @Bean
    public List<Music> musicList(){
        List<Music> musicList = new ArrayList<>();
        musicList.add(rockMusic());
        musicList.add(classicalMusic());
        //or
        //return Arrays.asList(classicalMusic(), rockMusic());
        return musicList;
    }
    @Bean MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }
}
