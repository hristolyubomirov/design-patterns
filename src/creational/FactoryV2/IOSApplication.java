package creational.FactoryV2;

public class IOSApplication extends Factory_Dialog{

    @Override
    public Button createButton(){
        return new IOSButton();
    }

}
