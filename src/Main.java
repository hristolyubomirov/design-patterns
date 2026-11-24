
import behavioral.Observer.Observer;
import behavioral.Observer.RealObserver;
import behavioral.Observer.RealObserver2;
import behavioral.Observer.WeatherSubject;
import behavioral.Observer2.RObserver1;
import behavioral.Observer2.RObserver2;
import behavioral.Observer2.Weather;
import creational.Builder.BuilderUsage;
import creational.Factory.RoadDelivery;
import creational.Factory.SeaDelivery;
import creational.FactoryV2.IOSApplication;
import creational.FactoryV2.WindowsApplication;
import creational.Singleton.SingletonEnum;
import creational.Singleton.Singleton_lock;
import creational.Singleton.Singleton;
import structural.Adapter.AdapterPrinter;
import structural.Adapter.LegacyPrinter;
import structural.Bridge.Blue;
import structural.Bridge.Square;

public class Main {
    public static void main(String[] args) {


     /*
     CREATIONAL - flexibility and reuse
     Help control how and when objects are instantiated.
     Singleton - Single instance
     Builder - Construciing complex objects
     Same method creates different variations of an object.
     Factory - instead 'new', using method for creating an object
     why?
     - you can override that method and decide which object to be created for a specific task
     example: Delivery -> road or sea; you don't want to create truck object for over sea delivery
     createTransport() -> boat or truck



     STRUCTURAL

     Facade - hides low level implementations, leaves high level methods
      */


        Singleton first = Singleton.getInstance("Hello");
//        System.out.println(first.getData());
        Singleton sec = Singleton.getInstance("Test");
        System.out.println(sec.getData());

        SingletonEnum.INSTANCE.doIt();

        Singleton_lock inst = Singleton_lock.getInstance();
        Singleton_lock inst2 = Singleton_lock.getInstance();
        System.out.println(inst);
        System.out.println(inst2);

        //Adapter
        LegacyPrinter lp = new LegacyPrinter();
        AdapterPrinter ap = new AdapterPrinter(lp);
        ap.print();





        //Factory

        BuilderUsage b1 = new BuilderUsage.Builder()
                .setFirst("First")
                //.setSecond("Second")
                .setThird("Third").build();
        b1.display();


        RoadDelivery r1 = new RoadDelivery();
        r1.createTransport().deliver();
        SeaDelivery r2 = new SeaDelivery();
        r2.createTransport().deliver();

        WindowsApplication w1 = new WindowsApplication();
        w1.createButton().onClick();
        IOSApplication ios = new IOSApplication();
        ios.createButton().onClick();

        //Bridge
        Blue colorBlue = new Blue();
        Square square = new Square(colorBlue);
        square.draw();
        String colorName = square.getColor().getColorName();
        System.out.println(colorName);

        //Behavioral - Observer

//        WeatherSubject ws = new WeatherSubject();
//        Observer realObserver = new RealObserver();
//        Observer realObserver2 = new RealObserver2();
//        ws.addObserver(realObserver);
//        ws.addObserver(realObserver2);
//        // Simulating weather change
//        ws.setWeather("Sunny");
//

    Weather weather = new Weather();
    //weather.setWeather("");
        weather.setWeather("Sunny");
        RObserver1 ro1 = new RObserver1();
        RObserver2 ro2 = new RObserver2();
//        weather.notifyObserver();
        weather.addObserver(ro1);
        weather.addObserver(ro2);
        //weather.removeObserver(ro2);
        weather.notifyObserver();





    }


}