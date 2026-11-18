package creational.FactoryV2;

public class WindowsApplication extends Factory_Dialog{

    @Override
    public Button createButton(){
        return new WindowsButton();
    }

}
