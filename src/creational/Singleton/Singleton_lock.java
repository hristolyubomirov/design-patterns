package creational.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Singleton_lock {
    private static Singleton_lock instance;
    private static final Lock lock = new ReentrantLock();

    public Singleton_lock(){
    }

    public static Singleton_lock getInstance() {
        lock.lock();
        try{
            if(instance == null) {
                instance = new Singleton_lock();
            }
        }finally{
            lock.unlock();
        }
        return instance;
    }
}

