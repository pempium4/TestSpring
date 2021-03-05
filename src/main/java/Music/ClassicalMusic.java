package Music;

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit(){
        System.out.println("Initialization is done!");
    }
    public void doMyDestroy(){
        System.out.println("Destruction is done!");
    }
}
