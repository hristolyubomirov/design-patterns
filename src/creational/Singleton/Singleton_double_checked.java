package creational.Singleton;

public class Singleton_double_checked {

    private static volatile Singleton_double_checked inst;
    private Singleton_double_checked(){

    }
    public static Singleton_double_checked getInstance(){
        if(inst == null){
            synchronized(Singleton_double_checked.class){
                if(inst == null){
                    inst = new Singleton_double_checked();
                }
            }
        }
        return inst;
    }
}
