package creational.FactoryV2;

public class IOSButton implements Button{

    @Override
    public void onClick(){
        System.out.println("Apple button.");
    }
}
