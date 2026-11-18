package creational.Singleton;
public class Singleton {

    private static Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }


    public static Singleton getInstance(String data){
        if (instance == null) {
            instance = new Singleton(data);
        }
        return instance;
    }

    public String getData(){
        if (instance != null){
            return instance.data;
        }
        else throw new RuntimeException("Not such instance.");
    }
}

