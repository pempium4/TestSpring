package Music;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("musicBean")
//@Scope("prototype")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Initialization is done");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destruction is done");
    }
}
